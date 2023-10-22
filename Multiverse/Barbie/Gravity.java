import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gravity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gravity extends Actor
{
    public boolean falling; //define se esta a cair
    private int gravitySpeed; //a velocidade da gravidade quando cai

    public void gravity(){
        if(!(isTouching(Brick.class) || isTouching(Ground.class))){
            setLocation(getX(), getY()+ gravitySpeed);
            gravitySpeed++;
            falling = true;
        }
    }
    
    public void atGround(){
        if(isTouching(Brick.class) || isTouching(Ground.class)){
            gravitySpeed = 0;
            falling = false;
        }
    }
}
