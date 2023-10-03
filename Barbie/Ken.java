import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        int width = ken.getWidth();
        int height = ken.getHeight();
        ken.scale(width*3, height*3);
        ken1 = new GreenfootImage("ken1.png");
        ken2 = new GreenfootImage("ken2.png");
        int width1 = ken1.getWidth();
        int height1 = ken1.getHeight();
        int width2 = ken2.getWidth();
        int height2 = ken2.getHeight();
        ken1.scale(width1*3, height1*3);
        ken2.scale(width2*3, height2*3);
    }
    
    public void act()
    {
        movement("d", "a", ken, ken1, ken2);
        jump("w");
        atGround();
        gravity();
        
        
    }
}
