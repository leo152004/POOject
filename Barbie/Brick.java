import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Actor
{
    GreenfootImage brick = getImage();    
    public Brick(){
        int width = brick.getWidth();
        int height = brick.getHeight();
        brick.scale(width*3/2, height*3/2);
    }
}