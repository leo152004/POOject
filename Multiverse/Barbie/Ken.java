import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Ken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ken extends Players
{
    GreenfootImage ken = getImage();
    private GreenfootImage ken1, ken2;
    public int passos=0;
    private boolean startPlace;
    private int speed;
    
    public Ken(){
        ken1 = new GreenfootImage("ken1.png");
        ken2 = new GreenfootImage("ken2.png");
        speed = 5;
    }
    
    public void act()
    {
        if(!startPlace){
                passos=getX();
            startPlace = true;
        }
        move("d", "a", ken, ken1, ken2, passos, speed);
        jump("w");
        atGround();
        gravity();
        addPoints();
        enterLevel("s");
        if(Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("d") ){
           movingPlayer(false);
        } else if(Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("a")){
            movingPlayer(false);
        } else if((Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("d")) || (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("a"))){
            movingPlayer(true);
        } else 
            speed = 5;
    }
    
    private void movingPlayer(boolean walking){
        List<Barbie> ListP2 = getWorld().getObjects(Barbie.class);
        int WorldWidth = getWorld().getWidth();
        if(!ListP2.isEmpty()){
            Barbie barbie = ListP2.get(0);
            int Xbarbie = barbie.getX();
            if(Xbarbie > WorldWidth - 100 && getX() > 100){
               if (!walking)
                    move(-5);
               if (walking)
                   speed = 2;
            } else if(getX() < WorldWidth - 100 && Xbarbie < 100){
               if (!walking)
                    move(5);
               if (walking)
                   speed = 2;
            }
        }
    }
}
