import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    private int pontos; //pontos ganhos pelo jogador
    private City city;
    
    public Points(){
        if(getWorld() != city)
            pontos = city.pontosGlobal;
        getWorld().showText("Pontos: " + pontos, 600, 50);
    }

    public void addPoints(int timing){
        pontos += 120-timing;
        getWorld().showText("Pontos: " + pontos, 600, 50);
    }
}
