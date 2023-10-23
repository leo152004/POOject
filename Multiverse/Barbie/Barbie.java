import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Barbie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barbie extends Players
{
    GreenfootImage barbie = getImage();
    private GreenfootImage barbie1, barbie2, gif;

    public Barbie(){
        barbie1 = new GreenfootImage("barbie1.png");
        barbie2 = new GreenfootImage("barbie2.png");
    }

    public void act()
    {
        move("right", "left", barbie, barbie1, barbie2);
        jump("up");
        atGround();
        if(!jumping)
            gravity();
        enterLevel("down");
        isDead();
        outTheGround();
        subindoNivel();
    }

    public void subindoNivel(){
        World world = getWorldOfType(Level.class);
        if (world != null){
            descendo();
        }
    }
}