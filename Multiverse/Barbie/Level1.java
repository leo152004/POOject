import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Level0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    public Level1(){
        super(1200, 800, 1, false);
        decoracao();
        levellayers();
        addObject(new Points(), 0,0);
    }
    
    public void pisoDePedra()
    {
        for(int i = 0; i < getWidth(); i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Stone(), i, 747);
        }
    }
    
    public void decoracao(){
        addObject(new Cactus(),getWidth()/2, 707);
        addObject(new Cactus(),getWidth()-100, 707);
        addObject(new Cactus(),getWidth()-1100, 707);
        addObject(new Plant(),getWidth()/3, 707);
        addObject(new Plant(),getWidth()-300, 707);
        addObject(new Plant(),getWidth()-1000, 707);
    }
    
    public void levellayers(){
        for(int i = 0 ; i <=4 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),100);
        }
        for(int i = 0 ; i <=5 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),250);
        }
        for(int i = 0 ; i <=4 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),400);
        }
        for(int i = 0 ; i <=4 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),550);
        }
        for(int i = 0 ; i <=4 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),-50);
        }
            for(int i = 0 ; i <=5 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),-200);
        }
            for(int i = 0 ; i <=4 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),-350);
        }
        for(int i = 0 ; i <=4 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),-500);
        }
        for(int i = 0 ; i <=30 ; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(1100),-650);
        }        
    }
}