import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    private GreenfootImage endGame;
    
    public GameOver(){
        endGame = getImage();
        endGame.setTransparency(0);
        for(int i = 1; i < 256; i++)
            endGame.setTransparency(i);
    }
}
