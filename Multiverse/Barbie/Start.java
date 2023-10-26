import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    private GreenfootSound menuMusic;
    
    public Start()
    {    
        super(1000, 800, 1); 
        startMenu();
        Level.restartVidas();
        Level.restartP();
        menuMusic = new GreenfootSound("barbiemenu.mp3");
        menuMusic.playLoop();
    }
    
    public void startMenu(){
        addObject(new Icon(), getWidth()/2, getHeight()/3);
        addObject(new StartButton(), getWidth()/2, getHeight()*3/4);
    }
}
