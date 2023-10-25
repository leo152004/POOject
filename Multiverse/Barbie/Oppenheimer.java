import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oppenheimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oppenheimer extends Enemies
{
    private GreenfootImage base, walk1, walk2;
    private int flipCounter, imageFliped;
    private boolean flip;

    public Oppenheimer(){
        getWorld().addObject(new Hi(), getX()-50, getY()-50);
        base = getImage();
        walk1 = new GreenfootImage("oppenheimer1.png");
        walk2 = new GreenfootImage("oppenheimer2.png");        
    }

    public void act()
    {
        gravity();
        atGround();
        run();
    }

    private void run(){
        Players near = getObjectsInRange(300, Players.class).get(0);
        if (near != null)
            runAway();
        if (near == null)
            turnAround();
    }

    private void turnAround(){
        base.mirrorHorizontally();
        walk1.mirrorHorizontally();
        walk2.mirrorHorizontally();
        if(!flip)
            flip = true;
        else
            flip = false;
    }

    private void runAway(){
        move(5);
        moveImage();
    }

    private void moveImage(){
        if(flipCounter == 10){
            if(flip)
                turnAround();
            if(imageFliped == 0){
                setImage(walk1);
                imageFliped = 1;
            } else if (imageFliped == 1){
                setImage(base);
                imageFliped = 2;
            }else if (imageFliped == 2){
                setImage(walk2);
                imageFliped = 3;
            }else{
                setImage(base);
                imageFliped = 0;
            }
            flipCounter = 0;
        }
        flipCounter++;
    }
}
