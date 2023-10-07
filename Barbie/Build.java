import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Build here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Build extends MovingWorld
{
    GreenfootImage Build1 = getImage();
    public GreenfootImage Build2, Build3, halfBuild1, halfhalfBuild1, halfBuild2, halfhalfBuild2, halfBuild3, halfhalfBuild3;
    private boolean construido;
    
    public Build() {
        Build2 = new GreenfootImage("building2.png");
        Build3 = new GreenfootImage("building3.png");
    }
    
    public void act()
    {
        if(!construido){
            randomBuilding();
            construido = true;
        }
        movingWorld("building");
        removed();
        if(getX() == getWorld().getWidth()-200)
            newBuilding();
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
    
    private void removed(){
        if(getX() == 0){
            //getWorld().removeObject(this);
        }
    }
    
    private void newBuilding(){
        if(Greenfoot.getRandomNumber(100) < 2){
            getWorld().addObject(new Build(), getWorld().getWidth(), 332);
        }
    }
}
