import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class City here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * https://wallpaperaccess.com/city-pixel-art
 */
public class City extends World
{
    public int WorldWidth;
    public int pontos; //pontos ganhos pelo jogador
    
    public City()
    {    
        super(1200, 800, 1, false); 
        WorldWidth = getWidth();
        worldBuilder();
        setPaintOrder(Barbie.class, Ken.class, Coin.class, Brick.class, Build.class, FundoMovel.class);
    }
        
    public void worldBuilder(){
        addObject(new FundoMovel(), WorldWidth, getHeight()/2);
        addObject(new Barbie(), WorldWidth*2/3, 600);
        addObject(new Ken(), WorldWidth/3, 600);
        for(int i = 500; i <= 5500; i += 1000){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Build(), i, 223);
        }
        for(int i = 0; i < 6000; i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Brick(), i, 747);
        }
        
        addObject(new FundoMovel(), WorldWidth/2, getHeight()/2);
    }
    
    public void addPoints(){
        pontos += 20;
        showText("Pontos: " + pontos, getWidth()/2, 50);
    }
}
