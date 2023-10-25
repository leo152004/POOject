import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Build here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Build extends Actor
{
    private GreenfootImage Build1 = getImage();
    private GreenfootImage Build2, Build3;
    private boolean construido;
    
    public Build() {
        Build2 = new GreenfootImage("building2.png");
        Build3 = new GreenfootImage("building3.png");
    }
    
    public void act()
    {
        runOnce();
    }
    
    private void runOnce(){
        if(!construido){
            randomBuilding();
            construido = true;
        }
    }
    
    private void randomBuilding(){
        int building = Greenfoot.getRandomNumber(100);
        if (building < 33){
            setImage(Build2);
            setLocation(getX(), 252);
        } else if (building > 65){
            setImage(Build3);
            setLocation(getX(), 260);
        } else{
            setLocation(getX(), 332);
        }
    }
}
