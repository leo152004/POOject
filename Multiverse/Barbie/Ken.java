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
    private GreenfootImage ken = getImage();
    private GreenfootImage ken1, ken2;

    public Ken(){
        ken1 = new GreenfootImage("ken1.png");
        ken2 = new GreenfootImage("ken2.png");
    }

    public void act()
    {
        move("d", "a", ken, ken1, ken2);
        jump("w");
        atGroundConfirm();
        if(!getJumping())
            gravity();
        isDead();
        outTheGround();
        subindoNivel();
        youWon();
    }

    private void atGroundConfirm(){
        List<Ground> platforms = getIntersectingObjects(Ground.class);
        if(!platforms.isEmpty() && platforms.get(0).getY() >= getY())
            atGround();
    }

    private void subindoNivel(){
        World world = getWorldOfType(Level.class);
        if (world != null){
            descendo();
        }
    }
}
