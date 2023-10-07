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
    private boolean moving;
    
    public void movingWorld(String whatsThis){
        List<Barbie> ListB = getWorld().getObjects(Barbie.class);
        List<Ken> ListK = getWorld().getObjects(Ken.class);
        if(!(ListB.isEmpty() && ListK.isEmpty())){
            Barbie barbie = ListB.get(0);
            Ken ken = ListK.get(0);
            int Xbarbie = barbie.getX();
            int WorldWidth = getWorld().getWidth();
            if(Greenfoot.isKeyDown("right")){
                if((Xbarbie > WorldWidth - 100 &&  ken.getX() > 100) && !moving){
                    if(whatsThis == "background"){
                        move(-1);
                        moving = true;
                    } else{
                        move(-5);
                        moving = true;
                    }
                    if(whatsThis == "brick")
                       if(getX() == 0)
                           setLocation(getWorld().getWidth(), getY());
                }
            } 
            if(Greenfoot.isKeyDown("d")){
                if(ken.getX() > WorldWidth - 100 && Xbarbie > 100 && !moving){
                   if(whatsThis == "background"){
                        move(-1);
                        moving = true;
                    } else{
                        move(-5);
                        moving = true;
                    }
                   if(whatsThis == "brick")
                       if(getX() == 0)
                           setLocation(getWorld().getWidth(), getY());
                }
            }
            if(Greenfoot.isKeyDown("left")){
                if(ken.getX() < WorldWidth - 100 && Xbarbie < 100 && !moving){
                   if(whatsThis == "background"){
                        move(1);
                        moving = true;
                    } else{
                        move(5);
                        moving = true;
                    }
                   if(whatsThis == "brick")
                       if(getX() == getWorld().getWidth()-1)
                           setLocation(0, getY());
                }
            }
            if(Greenfoot.isKeyDown("a")){
                if(Xbarbie < WorldWidth - 100 && ken.getX() < 100 && !moving){
                   if(whatsThis == "background"){
                        move(1);
                        moving = true;
                    } else{
                        move(5);
                        moving = true;
                    }
                   if(whatsThis == "brick")
                       if(getX() == getWorld().getWidth()-1)
                           setLocation(0, getY());
                }
            }
            moving = false; 
        }
    }
}
