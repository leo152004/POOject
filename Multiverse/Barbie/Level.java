import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
        setPaintOrder(NextLevel.class, GameOver.class, Vidas.class, Barbie.class, Ken.class, Special.class, Stone.class, Plant.class, Cactus.class, Ground.class);
        vidas = 3;
        addObject(new Vidas(), 100, 50);
    }

    public void highDeath(Players player){
        vidas--;
        Vidas vida = getObjects(Vidas.class).get(0);
        vida.checkLife();
        for(int i = 0; i < 3; i++){
            player.getImage().setTransparency(0);
            Greenfoot.delay(20);
            player.getImage().setTransparency(255);
            Greenfoot.delay(20);
        }
        if(vidas > 0){
            List<Stone> stones = getObjects(Stone.class);
            List<Ground> ground = getObjects(Ground.class);
            List<Plant> plants = getObjects(Plant.class);
            List<Cactus> cactus = getObjects(Cactus.class);
            List<Enemies> enemies = getObjects(Enemies.class);
            removeObjects(stones);
            removeObjects(ground);
            removeObjects(plants);
            removeObjects(cactus);
            removeObjects(enemies);
           // removeObject(vida);
            Players ken = getObjects(Ken.class).get(0);
            Players barbie = getObjects(Barbie.class).get(0);
            ken.setLocation(200, 680);
            barbie.setLocation(400, 680);
        }
        if(vidas == 0){
            GameOver over = new GameOver();
            addObject(over, 600, 400);
            Greenfoot.delay(5);
            restartP();
            restartVidas();
            Greenfoot.stop();
        }
    }

    public void restartP(){
        pontos = 0;
    }

    public void restartVidas(){
        vidas = 0;
    }
}
