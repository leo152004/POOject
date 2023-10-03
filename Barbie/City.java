import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class City here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * https://wallpaperaccess.com/city-pixel-art
 */
public class City extends World
{

    public City()
    {    
        super(1000, 800, 1); 
        worldBuilder();
    }
    
    public void worldBuilder(){
        addObject(new GroundLine(), getWidth()/2, 650);
        addObject(new Barbie(), getWidth()*2/3, 600);
        addObject(new Ken(), getWidth()/3, 600);
    }
}
