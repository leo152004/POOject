import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level0 extends City
{
    public Level0()
    {
        for(int i = 0; i < getWidth(); i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Stone(), i, 747);
        }
    }
}
