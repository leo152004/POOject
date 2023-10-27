import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Oppenheimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oppenheimer extends Enemies
{
    private GreenfootImage base, walk1, walk2;
    private int direction;

    public Oppenheimer(){
        base = getImage();
        walk1 = new GreenfootImage("oppenheimer1.png");
        walk2 = new GreenfootImage("oppenheimer2.png"); 
        direction = 3;
    }

    public void act()
    {
        gravity();
        atGround();
        moving(direction);
        moveImage(base,walk1,walk2);
    }
    
    public void moving(int speed){
        if ((direction == 3 && isTouching(Cactus.class)) || (direction == -3 && isTouching(Plant.class)) || isAtEdge()) 
            direction = -direction;
        move(direction);
    }
}
