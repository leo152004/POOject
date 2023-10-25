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
    private int flipCounter, imageFliped, direction;
    private boolean flip, reconstructed;

    public Oppenheimer(){
        base = getImage();
        walk1 = new GreenfootImage("oppenheimer1.png");
        walk2 = new GreenfootImage("oppenheimer2.png"); 
        direction = 1;
    }

    public void act()
    {
        gravity();
        atGround();
        move();
        moveImage(base,walk1,walk2);
    }

    private void move(){
        if ((direction == 1 && isTouching(Cactus.class)) || (direction == -1 && isTouching(Plant.class)) || isAtEdge()) 
            direction = -direction;
        move(direction);
    }

    private void moveImage(GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
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
        flipImage(base, walk1, walk2);
    }

    private void flipImage(GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(isTouching(Cactus.class)){
            if(!flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = true;
            }
        }
        if(isTouching(Plant.class)){
            if(flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = false;
            }
        }
        if(isAtEdge()){
            if(!flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = true;
            }
            if(flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = false;
            }
        }
    }
}
