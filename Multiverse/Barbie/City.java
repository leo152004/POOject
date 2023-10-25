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
        super(1200, 800, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(new Boom(), 600, 400);
    }
}
