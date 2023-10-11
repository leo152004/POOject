import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    public Start()
    {    
        super(1000, 800, 1); 
        startMenu();
    }
    
    public void startMenu(){
        Icon icon = new Icon();
        addObject(icon, getWidth()/2, getHeight()/3);
        StartButton start = new StartButton();
        addObject(start, getWidth()/2, getHeight()*3/4);
    }
}
