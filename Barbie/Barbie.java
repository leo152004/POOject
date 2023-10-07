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
        movement("right", "left", barbie, barbie1, barbie2);
        jump("up");
        atGround();
        gravity();
        if(Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("right") ){
           movingPlayer();
        } else if(Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("left")){
            movingPlayer();
        }
    }
    
    private void movingPlayer(){
        List<Ken> ListP1 = getWorld().getObjects(Ken.class);
        if(!ListP1.isEmpty()){
            Ken ken = ListP1.get(0);
            int Xken = ken.getX();
            int WorldWidth = getWorld().getWidth();
            if(Xken > WorldWidth - 100 && getX() > 100){
                move(-5);
            } else if(getX() < WorldWidth - 100 && Xken < 100){
                move (5);
            }
        }
    }
}
