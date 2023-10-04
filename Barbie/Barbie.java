import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barbie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barbie extends Players
{
    GreenfootImage barbie = getImage();
    private GreenfootImage barbie1, barbie2, gif;
    
    public Barbie(){
        int width = barbie.getWidth();
        int height = barbie.getHeight();
        barbie.scale(width*3, height*3);
        barbie1 = new GreenfootImage("barbie1.png");
        barbie2 = new GreenfootImage("barbie2.png");
        int width1 = barbie1.getWidth();
        int height1 = barbie1.getHeight();
        int width2 = barbie2.getWidth();
        int height2 = barbie2.getHeight();
        barbie1.scale(width1*3, height1*3);
        barbie2.scale(width2*3, height2*3);
    }
    
    public void act()
    {
        movement("right", "left", barbie, barbie1, barbie2);
        jump("up");
        atGround();
        gravity();
    }
}
