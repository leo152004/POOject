import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    public int pontos; //pontos ganhos pelo jogador
    
    public void addPoints(){
        pontos += 20;
        getWorld().showText("Pontos: " + pontos, getWorld().getWidth()/2, 50);
    }
}
