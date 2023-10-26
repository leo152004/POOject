import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Ken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ken extends Players
{
    private GreenfootImage ken = getImage();
    private GreenfootImage ken1, ken2;

    public Ken(){
        ken1 = new GreenfootImage("ken1.png");
        ken2 = new GreenfootImage("ken2.png");
    }

    public void act()
    {
        movementManager("d", "a", ken, ken1, ken2, "w");
    }
}
