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
            int Xken = ken.getX();
            int WorldWidth = getWorld().getWidth();
            
            rightBarbie(Xbarbie, Xken, WorldWidth, whatsThis);
            leftBarbie(Xbarbie, Xken, WorldWidth, whatsThis);
            rightKen(Xbarbie, Xken, WorldWidth, whatsThis);
            leftKen(Xbarbie, Xken, WorldWidth, whatsThis);
            moving = false; 
        }
    }
    
    private void rightBarbie(int Xbarbie, int Xken, int WorldWidth, String whatsThis){
        if(Greenfoot.isKeyDown("right")){
                if((Xbarbie > WorldWidth - 100 &&  Xken > 100) && !moving){
                    if(whatsThis == "background"){
                        move(-1);
                        moving = true;
                    } else{
                        move(-5);
                        moving = true;
                    }
                    if(getX() == 0 && whatsThis == "building"){
                            getWorld().addObject(new Build(), getWorld().getWidth()+250, 332);
                            getWorld().addObject(new Coin(), getWorld().getWidth()+20, Greenfoot.getRandomNumber(100)+450);
                        }
                }
            } 
    }
    
    private void leftBarbie(int Xbarbie, int Xken, int WorldWidth, String whatsThis){
        if(Greenfoot.isKeyDown("left")){
                if(Xken < WorldWidth - 100 && Xbarbie < 100 && !moving){
                   if(whatsThis == "background"){
                        move(1);
                        moving = true;
                    } else{
                        move(5);
                        moving = true;
                    }
                }
            }
    }
    
    private void rightKen(int Xbarbie, int Xken, int WorldWidth, String whatsThis){
        if(Greenfoot.isKeyDown("d")){
                if(Xken > WorldWidth - 100 && Xbarbie > 100 && !moving){
                   if(whatsThis == "background"){
                        move(-1);
                        moving = true;
                    } else{
                        move(-5);
                        moving = true;
                    }
                   if(getX() == 0 && whatsThis == "building"){
                            getWorld().addObject(new Build(), getWorld().getWidth()+250, 332);
                            getWorld().addObject(new Coin(), getWorld().getWidth()+20, Greenfoot.getRandomNumber(50)+500);
                        }
                }
            }
    }
    
    private void leftKen(int Xbarbie, int Xken, int WorldWidth, String whatsThis){
        if(Greenfoot.isKeyDown("a")){
                if(Xbarbie < WorldWidth - 100 && Xken < 100 && !moving){
                   if(whatsThis == "background"){
                        move(1);
                        moving = true;
                    } else{
                        move(5);
                        moving = true;
                    }
                }
            }
    }
}
