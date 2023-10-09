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
    
    public Ken(){
        ken1 = new GreenfootImage("ken1.png");
        ken2 = new GreenfootImage("ken2.png");
    }
    
    public void act()
    {
        movement("d", "a", ken, ken1, ken2);
        jump("w");
        atGround();
        gravity();
        addPoints();
        playerGround();
        if(Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("d") ){
           movingPlayer();
        } else if(Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("a")){
            movingPlayer();
        }
    }
    
    private void movingPlayer(){
        List<Barbie> ListP2 = getWorld().getObjects(Barbie.class);
        int WorldWidth = getWorld().getWidth();
        if(!ListP2.isEmpty()){
            Barbie barbie = ListP2.get(0);
            int Xbarbie = barbie.getX();
            if(Xbarbie > WorldWidth - 100 && getX() > 100){
               move(-5);
            } else if(getX() < WorldWidth - 100 && Xbarbie < 100){
               move(5);
            }
        }
    }
}
