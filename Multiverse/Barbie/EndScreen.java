import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    private GreenfootSound endGame;
    
    public EndScreen()
    {    
        super(1200, 800, 1); 
        endGame = new GreenfootSound("barbie.mp3");
        endGame.play();
    }
}
