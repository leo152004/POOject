import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MovingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingWorld extends Actor
{

    public void movingWorld(){
        if( Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            List<Barbie> ListB = getWorld().getObjects(Barbie.class);
            List<Ken> ListK = getWorld().getObjects(Ken.class);
            if(!(ListB.isEmpty() && ListK.isEmpty())){
                Barbie barbie = ListB.get(0);
                Ken ken = ListK.get(0);
                int Xbarbie = barbie.getX();
                int WorldWidth = getWorld().getWidth();
                if((Xbarbie >= WorldWidth - 100 || ken.getX() >= WorldWidth - 100) && (Xbarbie > 100 && ken.getX() > 100)){
                   move(-5);
                }
            }
        } else if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            List<Barbie> ListB = getWorld().getObjects(Barbie.class);
            List<Ken> ListK = getWorld().getObjects(Ken.class);
            if(!(ListB.isEmpty() && ListK.isEmpty())){
                Barbie barbie = ListB.get(0);
                Ken ken = ListK.get(0);
                int Xbarbie = barbie.getX();
                int WorldWidth = getWorld().getWidth();
                if((Xbarbie <= WorldWidth - 100 || ken.getX() <= WorldWidth - 100) && (Xbarbie < 100 && ken.getX() < 100)){
                   move(5);
                }
            }
        }
    }
}
