import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    public Level3()
    {    
        pisoDePedra();
        setBackground("BackgroundLevel.png");
        decoracao();
        //levellayers();
        prepare();
        addObject(new Barbie(),200, 707);
        addObject(new Ken(), 400, 707);
    }

    public void pisoDePedra()
    {
        for(int i = 0; i < getWidth(); i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Stone(), i, 747);
        }
    }
    
    public void death(Players player){
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
            Greenfoot.setWorld(new Level3());
        }
        if(vidas == 0){
            GameOver over = new GameOver();
            addObject(over, 600, 400);
            Greenfoot.delay(2048);
            removeObject(getObjects(GameOver.class).get(0));
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
    /*public void levellayers(){
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
    }*/

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Stone(),208,557);
        addObject(new Stone(),72,527);
        addObject(new Stone(),425,400);
        addObject(new Stone(),559,400);
        addObject(new Stone(),693,400);
        addObject(new Security(),388,339);
        addObject(new Stone(),925,547);
        addObject(new Stone(),1132,409);
        addObject(new Stone(),828,371);
        addObject(new Plant(),783,327);
        addObject(new Cactus(),16,492);
        addObject(new Stone(),199,256);
        addObject(new Stone(),71,71);
        addObject(new Stone(),938,143);
        addObject(new Stone(),1070,144);
        addObject(new Stone(),1141,118);
        addObject(new Business(),892,87);
        addObject(new Plant(),1178,72);
        addObject(new Cactus(),1179,370);
        addObject(new Stone(),427,115);
        addObject(new Stone(),531,90);
        addObject(new Stone(),319,-101);
        addObject(new Stone(),453,-129);
        addObject(new Stone(),743,-60);
        addObject(new Stone(),983,-143);
        addObject(new Stone(),1119,-144);
        addObject(new Stone(),783,-310);
        addObject(new Stone(),647,-339);
        addObject(new Plant(),358,-147);
        addObject(new Cactus(),451,80);
        addObject(new Plant(),739,-352);
        addObject(new Security(),939,-205);
        addObject(new Business(),472,-400);
        addObject(new Stone(),514,-541);
        addObject(new Plant(),507,-585);
        addObject(new Cactus(),631,-575);
        addObject(new Stone(),67,-302);
        addObject(new Stone(),200,-301);
        addObject(new Security(),27,-364);
        addObject(new Stone(),128,-534);
        addObject(new Stone(),990,-409);
        addObject(new Stone(),1138,-539);
        addObject(new Cactus(),1038,-444);
        addObject(new Cactus(),76,-568);
        addObject(new Stone(),528,-339);
        addObject(new Stone(),545,-541);
        addObject(new Stone(),413,-541);
        addObject(new Stone(),659,-541);
        addObject(new Stone(),765,-541);
        addObject(new Stone(),689,204);
        addObject(new Business(),478,27);
        addObject(new Plant(),13,-346);
        addObject(new Plant(),931,-185);
        addObject(new Plant(),370,357);
        addObject(new Cactus(),1182,-180);
        addObject(new Cactus(),752,367);
        addObject(new Cactus(),261,-339);
        List<Stone> stones = getObjects(Stone.class);
        for (int i = 0; i < stones.size(); i++){
            int x = stones.get(i).getX();
            int y = stones.get(i).getY() - 16;
            addObject(new Ground(), x, y);
        }
    }
}
