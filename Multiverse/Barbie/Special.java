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
    GreenfootImage secador;
    Level0 lev0;
    public Special(){
        secador = new GreenfootImage("Secador.png");
        lev0 = getWorldOfType(Level0.class);
        checkImage();
    }

    public void act(){
        if (!isTouching(NextLevel.class))
            descendo();
    }
    
    private void checkImage(){
      
        if (lev0 != null){
            setImage(secador);
        }
    }
}
