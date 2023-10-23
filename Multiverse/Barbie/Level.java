import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    public static int pontos, vidas;
    
    public Level()
    {    
        super(1200, 800, 1, false);
        setPaintOrder(GameOver.class, Vidas.class, Barbie.class, Ken.class, Stone.class, Plant.class, Cactus.class, Ground.class);
        vidas = 3;
        addObject(new Vidas(), 100, 50);
    }
    
    public void death(Actor a){}
    
    public void restartP(){
        pontos = 0;
    }
    
    public void restartVidas(){
        vidas = 0;
    }
}
