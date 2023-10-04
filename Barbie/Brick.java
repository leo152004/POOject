import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends MovingWorld
{
    GreenfootImage brick = getImage();    
    public Brick(){
        int width = brick.getWidth();
        int height = brick.getHeight();
        brick.scale(width*3, height*3);
    }
    
    public void act(){
        movingWorld();
    }
}