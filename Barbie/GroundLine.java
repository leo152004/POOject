import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundLine extends Actor
{
    GreenfootImage Line = getImage();
    
    public GroundLine(){
        int height = Line.getHeight();
        int width = Line.getWidth();
        Line.scale(width*2, height/10);
        Line.setTransparency(0);
    }
}
