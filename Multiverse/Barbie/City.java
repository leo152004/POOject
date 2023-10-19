import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
        super(1200, 800, 1, false); 
        WorldWidth = getWidth();
        worldBuilder();
        setPaintOrder(Barbie.class, Ken.class, Coin.class, Brick.class, Build.class, FundoMovel.class);
    }
        
    public void worldBuilder(){
        addObject(new Barbie(), WorldWidth*2/3, 600);
        addObject(new Ken(), WorldWidth/3, 600);
        for(int i = 500; i <= 4500; i += 1000){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Build(), i, 223);
        }
        for(int i = 0; i < 6000; i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Brick(), i, 747);
        }
    }
}
