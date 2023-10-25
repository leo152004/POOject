import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Oppenheimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oppenheimer extends Enemies
{
    private GreenfootImage base, walk1, walk2;
    private int flipCounter, imageFliped;
    private boolean flip, reconstructed;

    public Oppenheimer(){
        base = getImage();
        walk1 = new GreenfootImage("oppenheimer1.png");
        walk2 = new GreenfootImage("oppenheimer2.png");        
    }

    public void act()
    {
        reConstructor();
        gravity();
        atGround();
        run();
        if(Greenfoot.isKeyDown("y"))
            getWorld().showText(""+getY(), 900, 50);
    }

    private void reConstructor(){
        if(!reconstructed){
            getWorld().addObject(new Hi(), getX()-50, getY()-50);
            reconstructed = true;
        }
    }

    private void run(){
        List<Players> near = getObjectsInRange(300, Players.class);
        if (near != null)
            runAway();
        if (near == null && flip)
            turnAround();
    }

    private void turnAround(){
        base.mirrorHorizontally();
        walk1.mirrorHorizontally();
        walk2.mirrorHorizontally();
        if(!flip)
            flip = true;
        else
            flip = false;
    }

    private void runAway(){
        move(5);
        moveImage();
    }

    private void moveImage(){
        if(flipCounter == 10){
            if(flip)
                turnAround();
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
    }
}
