import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Gravity
{
    public boolean jumping; //define se esta a saltar
    private boolean flip; //define se a imagem esta invertida ou nao
    private int jumpHeight;  //a altura que o player pode saltar
    private int flipCounter; // contador para mudar a imagem
    private int imageFliped; //qual a imagem a ser usada
    private boolean atGround;
    City city;
    Level level;
    Level0 theLevel;

    public void move(String right, String left, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(Greenfoot.isKeyDown(right)){
            move(5);
        }
        if(Greenfoot.isKeyDown(right))
            moveImage(left, right, base, walk1, walk2);
        if(Greenfoot.isKeyDown(left)){
            move(-5);
        }
        if(Greenfoot.isKeyDown(left))
            moveImage(left, right, base, walk1, walk2);

        if(!(Greenfoot.isKeyDown(left) || Greenfoot.isKeyDown(right))){
            setImage(base);
            imageFliped = 0;
        }
    }

    public void moveImage(String left, String right, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(flipCounter == 10){
            if(imageFliped == 0){
                setImage(walk1);
                imageFliped = 1;
            } else if (imageFliped == 1){
                setImage(base);
                imageFliped = 2;
            }else if (imageFliped == 2){
                setImage(walk2);
                imageFliped = 3;
            }else{
                setImage(base);
                imageFliped = 0;
            }
            flipCounter = 0;
        }
        flipCounter++;

        if(Greenfoot.isKeyDown(left)){
            if(!flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = true;
            }
        }
        if(Greenfoot.isKeyDown(right)){
            if(flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = false;
            }
        }
    }

    public void jump(String up){
        if(Greenfoot.isKeyDown(up) && falling == false && jumping == false){
            jumping = true;
            jumpHeight = 20;
            setLocation(getX(), getY()-jumpHeight);
        }
        else if (jumping == true && falling == false){
            jumpHeight--;
            setLocation(getX(), getY()-jumpHeight);
        }
        if (jumping == true && jumpHeight <= 0){
            jumping = false;
            falling = true;
        }
    }

    public void enterLevel(String down){
        if (Greenfoot.isKeyDown(down) && (getWorld() instanceof City) && (getX() >= 550 && getX() <= 650)){
            Greenfoot.setWorld(new Level0());
        }
    }

    public void isDead(){
        if(isTouching(Business.class) || isTouching(Oppenheimer.class) || isTouching(Security.class) || getY() >= 799){
            theLevel = getWorldOfType(Level0.class);
            theLevel.death(this);
        }
    }

    public void outTheGround(){
        List<Ground> platforms = getIntersectingObjects(Ground.class);
        if (!platforms.isEmpty()){
            setLocation(getX(), platforms.get(0).getY()-getImage().getHeight()/2);
        }
    }
}
