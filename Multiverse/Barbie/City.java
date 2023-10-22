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
    public int WorldWidth;
    public int pontos; //pontos ganhos pelo jogador
    List<Build> buildings;
    
    public City()
    {    
        super(1200, 800, 1, false); 
        WorldWidth = getWidth();
        worldBuilder();
        buildings = getObjects(Build.class);
        setPaintOrder(Barbie.class, Ken.class, Brick.class, Build.class);
    }
        
    public void worldBuilder(){
        addObject(new Barbie(), WorldWidth*2/3, 600);
        addObject(new Ken(), WorldWidth/3, 600);
        addObject(new Build(), 600, 223);
        for(int i = 0; i < getWidth()/2; i += 96){ 
            addObject(new Brick(), i, 747);
        }
    }
}
