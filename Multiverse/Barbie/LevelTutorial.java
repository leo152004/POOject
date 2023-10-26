import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTutorial extends Level
{
    public LevelTutorial(){
        addObject(new Tutorial(), 600, 400);
        addObject(new Tutorial2(), 600, 500);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("e")){
            Greenfoot.setWorld(new Level0());
        }
    }
}
