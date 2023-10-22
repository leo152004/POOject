import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelObjects extends Gravity
{
    private int contas;

    public void descendo(){
        if(contas == 2){
            setLocation(getX(), getY()+1);
            contas = 0;
        }
        contas++;
    }
}
