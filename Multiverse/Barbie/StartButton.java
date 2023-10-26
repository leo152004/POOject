import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    public void act(){
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new LevelTutorial());
        }
    }
}
