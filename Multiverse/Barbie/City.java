import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class City here.
 * 
 * @author Leandro Gonçalves 
 * @version 19/10/2023
 * https://wallpaperaccess.com/city-pixel-art
 */
public class City extends World
{
    public City()
    {    
        super(1200, 800, 1, false); 
        worldBuilder();
        setPaintOrder(Barbie.class, Ken.class, Brick.class, Build.class);
    }
    
    public void death(Actor a){}
        
    public void worldBuilder(){
        addObject(new Barbie(), getWidth()*2/3, 600);
        addObject(new Ken(), getWidth()/3, 600);
        addObject(new Build(), 600, 223);
        for(int i = 0; i < getWidth(); i += 96){ 
            addObject(new Brick(), i, 747);
        }
    }
}
