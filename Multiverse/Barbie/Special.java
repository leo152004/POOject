import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Special here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Special extends LevelObjects
{
    public void Special(){
        showLevel();
    }

    private void showLevel(){
        World level = getWorld();
        if (level instanceof Level0)
            getWorld().showText("Nivel 1", 600, 30);
        if (level instanceof Level1)
            getWorld().showText("Nivel 2", 600, 30);
        if (level instanceof Level2)
            getWorld().showText("Nivel 3", 600, 30);
        if (level instanceof Level3)
            getWorld().showText("Nivel 4", 600, 30);
        if (level instanceof Level4)
            getWorld().showText("Nivel 5", 600, 30);
    }

    public void act(){
        if (!isTouching(NextLevel.class))
            descendo();
    }
}
