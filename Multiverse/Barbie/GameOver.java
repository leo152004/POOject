import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private GreenfootSound dead;
    
    public GameOver()
    {
        super(1200, 800, 1); 
        
        dead = new GreenfootSound("Undertale_fans.mp3");
        dead.play();
        Greenfoot.stop();
    }
}
