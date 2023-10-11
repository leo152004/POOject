import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    public boolean jumping; //define se esta a saltar
    public boolean falling; //define se esta a cair
    public boolean flip; //define se a imagem esta invertida ou nao
    public int jumpHeight;  //a altura que o player pode saltar
    public int gravitySpeed; //a velocidade da gravidade quando cai
    public int flipCounter; // contador para mudar a imagem
    public int imageFliped; //qual a imagem a ser usada
    private int passos;
    private boolean addBrick;
    
    public void movement(String right, String left, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(Greenfoot.isKeyDown(right) && getX() <= getWorld().getWidth()-100){
            move(5);
            passos+=5;
        }
        if(Greenfoot.isKeyDown(right))
            moveImage(left, right, base, walk1, walk2);
        if(Greenfoot.isKeyDown(left) && getX() >= 100){
            move(-5);
            passos-=5;
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
    
    public void gravity(){
        if(!isTouching(Brick.class)){
            if(!jumping){
                setLocation(getX(), getY()+ gravitySpeed);
                gravitySpeed++;
                falling = true;
            }
        }
    }
    
    public void atGround(){
        if(isTouching(Brick.class)){
            gravitySpeed = 0;
            falling = false;
        }
    }
    
    public void addPoints(){
        if(isTouching(Coin.class)){
            City Level1 = (City)getWorld();
            removeTouching(Coin.class);
            Level1.addPoints();
        }
    }
    
    public void playerGround(){
        /*int WorldWidth = getWorld().getWidth();
        int Max = getX();
        int Min = getX();
        List<Brick> BrickManager = getObjectsInRange(170, Brick.class);
        if(isTouching(Brick.class)){
            if(!BrickManager.isEmpty()){
                for(int i = 0; i < BrickManager.size(); i++){
                    int a = BrickManager.get(i).getX();
                    if (a > Max)
                        Max = a;
                    if (a < Min)
                        Min = a;
                }
                if (Max <= getX()+120)
                    getWorld().addObject(new Brick(), getX()+150, 747);
                if (Min >= getX()-120)
                    getWorld().addObject(new Brick(), getX()-150, 747); 
            }
        }*/
    }
}
