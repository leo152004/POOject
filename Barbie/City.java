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
    public int WorldWidth;
    public City()
    {    
        super(1000, 800, 1); 
        WorldWidth = getWidth();
        worldBuilder();
        setPaintOrder(Barbie.class, Ken.class, Brick.class, Build.class, GroundLine.class);
    }
    
    public void worldBuilder(){
        addObject(new GroundLine(), WorldWidth/2, 650);
        addObject(new Barbie(), WorldWidth*2/3, 600);
        addObject(new Ken(), WorldWidth/3, 600);
        Greenfoot.delay(5);
        addObject(new Build(), WorldWidth, 211);
        for(int i = 0; i < WorldWidth; i += 48){
            addObject(new Brick(), i, 699);
        }
    }
}
