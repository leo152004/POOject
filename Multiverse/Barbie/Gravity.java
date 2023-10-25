import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gravity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gravity extends Actor
{
    private boolean falling; //define se esta a cair
    private int gravitySpeed; //a velocidade da gravidade quando cai
    private int contas;
    private int desceu;

    public void gravity(){
        if(!isTouching(Ground.class)){
            setLocation(getX(), getY()+ gravitySpeed);
            gravitySpeed++;
            falling = true;
        }
    }
    
    public boolean getFalling(){
        return falling;
    }
    
    public void setFalling(boolean fall){
        falling = fall;
    }

    public void descendo(){
        if (desceu < 1200){
                setLocation(getX(), getY()+2);
                desceu++;
        }
    }

    public void atGround(){
        if(isTouching(Ground.class)){
            gravitySpeed = 0;
            falling = false;
        }
    }
}
