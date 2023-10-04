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
    GreenfootImage build1 = getImage();
    public GreenfootImage build2, build3;
    
    public Build() {
        build2 = new GreenfootImage("building2.png");
        build3 = new GreenfootImage("building3.png");
        int Bwidth1 = build1.getWidth();
        int Bheight1 = build1.getHeight();
        int Bwidth2 = build2.getWidth();
        int Bheight2 = build2.getHeight();
        int Bwidth3 = build3.getWidth();
        int Bheight3 = build3.getHeight();
        build1.scale(Bwidth1*10, Bheight1*10);
        build2.scale(Bwidth2*10, Bheight2*10);
        build3.scale(Bwidth3*10, Bheight3*10);
        randomBuilding();
    }
    
    public void act()
    {
        movingWorld();
    }
    
    private void randomBuilding(){
        int building = Greenfoot.getRandomNumber(100);
        if (building < 33){
            setImage(build2);
            setLocation(getX(), 252);
        } else if (building > 65){
            setImage(build3);
            setLocation(getX(), 234);
        } else{
            setLocation(getX(), 332);
        }
    }
}
