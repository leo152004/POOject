import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor
{
    Level level;
    private GreenfootImage coracao3, coracao2, coracao1;

    public void act()
    {
        coracao3 = getImage();
        coracao2 = new GreenfootImage("2coraçoes.png");
        coracao1 = new GreenfootImage("1coraçao.png");
    }

    public void checkLife(){
        int lifeStatus = level.vidas;
        GreenfootImage imagem = getImage();
        if (lifeStatus == 3 && imagem != coracao3){
            setImage(coracao3);
        } else if (lifeStatus == 2 && imagem != coracao2){
            setImage(coracao3);
        } else if (lifeStatus == 1 && imagem != coracao1){
            setImage(coracao3);
        }
    }
}
