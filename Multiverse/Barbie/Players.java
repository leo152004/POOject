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
    private boolean atGround;
    
    public void move(String right, String left, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2, int passos, int speed){
        if(passos <= 5900 && passos > 100){
            if(Greenfoot.isKeyDown(right) && getX() <= getWorld().getWidth()-100){
                move(speed);
                passos+=5;
            }
            if(Greenfoot.isKeyDown(right))
                moveImage(left, right, base, walk1, walk2);
            if(Greenfoot.isKeyDown(left) && getX() >= 100){
                move(-speed);
                passos-=5;
            }
            if(Greenfoot.isKeyDown(left))
                moveImage(left, right, base, walk1, walk2);
        }
        
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
        if(Greenfoot.isKeyDown(up) && jumping == false && !falling){
            jumping = true;
            jumpHeight = 20;
            setLocation(getX(), getY()-jumpHeight);
        }
        else if (jumping == true){
            jumpHeight--;
            setLocation(getX(), getY()-jumpHeight);
        }
         if (jumping == true && jumpHeight <= 0){
            jumping = false;
            falling = true;
        }
    }
    
    public void gravity(){
        if(!isTouching(Brick.class))
            if(!jumping){
                setLocation(getX(), getY()+ gravitySpeed);
                gravitySpeed++;
                falling = true;
            }
        else if(!isTouching(Stone.class))
            if(!jumping){
                setLocation(getX(), getY()+ gravitySpeed);
                gravitySpeed++;
                falling = true;
            }
    }
    
    public void atGround(){
        if(isTouching(Brick.class)){
            gravitySpeed = 0;
            falling = false;
        }
        else if(isTouching(Stone.class)){
            gravitySpeed = 0;
            falling = false;
        }
    }
    
    public void addPoints(){
        if(isTouching(Coin.class)){
            removeTouching(Coin.class);
            List<Points> points = getWorld().getObjects(Points.class);
            points.get(0).addPoints();
        }
    }
    
    public void enterLevel(String down){
        List<Build> builds = getWorld().getObjects(Build.class);
        for (int i = 0; i < builds.size(); i++)
            if(getX() >= builds.get(i).place-50 || getX() <= builds.get(i).place+50){
                if(builds.get(i).place == 500)
                    if(Greenfoot.isKeyDown(down))
                        Greenfoot.setWorld(new Level0());
                if(builds.get(i).place == 1500)     
                    if(Greenfoot.isKeyDown(down))
                        Greenfoot.setWorld(new Level1());
                if(builds.get(i).place == 2500)
                    if(Greenfoot.isKeyDown(down))
                        Greenfoot.setWorld(new Level2());
                if(builds.get(i).place == 3500)
                    if(Greenfoot.isKeyDown(down))
                        Greenfoot.setWorld(new Level3());
                if(builds.get(i).place == 4500)
                    if(Greenfoot.isKeyDown(down))
                        Greenfoot.setWorld(new Level4());
            }
    }
}
