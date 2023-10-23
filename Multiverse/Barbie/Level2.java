import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{
    public Level2()
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
            Greenfoot.setWorld(new Level2());
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
        addObject(new Stone(),127,596);
        addObject(new Stone(),247,596);
        addObject(new Stone(),384,569);
        addObject(new Stone(),69,372);
        addObject(new Stone(),518,542);
        addObject(new Stone(),854,473);
        addObject(new Stone(),985,446);
        addObject(new Stone(),1130,581);
        addObject(new Stone(),314,293);
        addObject(new Stone(),449,265);
        addObject(new Stone(),423,-581);
        addObject(new Stone(),555,-581);
        addObject(new Stone(),689,-581);
        addObject(new Stone(),822,-581);
        addObject(new Stone(),1129,277);
        addObject(new Stone(),639,380);
        addObject(new Stone(),740,190);
        addObject(new Stone(),875,190);
        addObject(new Stone(),78,49);
        addObject(new Stone(),177,84);
        addObject(new Stone(),437,-31);
        addObject(new Stone(),562,-31);
        addObject(new Stone(),1138,-2);
        addObject(new Stone(),1038,20);
        addObject(new Stone(),825,-129);
        addObject(new Stone(),192,-221);
        addObject(new Stone(),67,-404);
        addObject(new Stone(),502,-369);
        addObject(new Stone(),371,-369);
        addObject(new Stone(),1131,-49);
        addObject(new Stone(),966,-330);
        addObject(new Stone(),813,-582);
        addObject(new Cactus(),304,562);
        addObject(new Security(),73,532);
        addObject(new Plant(),70,550);
        addObject(new Cactus(),939,152);
        addObject(new Plant(),680,145);
        addObject(new Security(),700,127);
        addObject(new Plant(),389,-78);
        addObject(new Security(),389,-93);
        addObject(new Cactus(),561,-403);
        addObject(new Plant(),315,-410);
        addObject(new Security(),325,-430);
        addObject(new Security(),259,-556);
        addObject(new Plant(),26,4);
        addObject(new Plant(),1021,-374);
        addObject(new Plant(),571,-629);
        addObject(new Cactus(),699,-618);
        addObject(new Cactus(),1188,-525);
        addObject(new Plant(),1181,-45);
        addObject(new Cactus(),903,442);
        addObject(new Plant(),1043,397);
        addObject(new Cactus(),162,48);
        List<Stone> stones = getObjects(Stone.class);
        for (int i = 0; i < stones.size(); i++){
            int x = stones.get(i).getX();
            int y = stones.get(i).getY() - 16;
            addObject(new Ground(), x, y);
        }
    }
}
