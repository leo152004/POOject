import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Gravity
{
    private int flipCounter, imageFliped, direction;
    private boolean flip;

    public void moveImage(GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(flipCounter == 10){
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
        flipImage(base, walk1, walk2);
    }

    public void flipImage(GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(isTouching(Cactus.class)){
            if(!flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = true;
            }
        }
        if(isTouching(Plant.class)){
            if(flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = false;

            }
        }
        if(isAtEdge()){
            base.mirrorHorizontally();
            walk1.mirrorHorizontally();
            walk2.mirrorHorizontally();
            flip = true;
        }
    }
}
