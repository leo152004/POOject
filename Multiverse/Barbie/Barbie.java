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
    public int passos=0;
    private boolean startPlace;
    private int speed;
    private boolean wawlking;
    
    public Barbie(){
        barbie1 = new GreenfootImage("barbie1.png");
        barbie2 = new GreenfootImage("barbie2.png");
    }
    
    public void act()
    {
        if(!startPlace){
                passos=getX();
            startPlace = true;
        }
        move("right", "left", barbie, barbie1, barbie2, passos,speed);
        jump("up");
        atGround();
        gravity();
        addPoints();
        enterLevel("down");
        if(Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("right") ){
           movingPlayer(false);
        } else if(Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("left")){
            movingPlayer(false);
        } else if((Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("d")) || (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("a"))){
            movingPlayer(true);
        } else 
            speed = 5;
    }
    
    private void movingPlayer(boolean walking){
        int WorldWidth = getWorld().getWidth();
        List<Ken> ListP1 = getWorld().getObjects(Ken.class);
        if(!ListP1.isEmpty()){
            Ken ken = ListP1.get(0);
            int Xken = ken.getX();
            if(Xken > WorldWidth - 100 && getX() > 100){
               if (!walking)
                    move(-5);
               if (walking)
                   speed = 2;
            } else if(getX() < WorldWidth - 100 && Xken < 100){
                move (5);
            }
        }
    }
}
