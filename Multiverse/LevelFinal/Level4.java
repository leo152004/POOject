import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(1200, 800, 1, false); 
        pisoDePedra();
        setBackground("trinity.png");
        decoracao();
        //levellayers();
        prepare();
        addObject(new Barbie(),200, 707);
        
    }
    

    public void pisoDePedra()
    {
        for(int i = 0; i < getWidth(); i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Stone(), i, 747);
            addObject(new Stone(), i, 770);
            addObject(new Stone(), i, 790);
            addObject(new Stone(), i, 800);
            
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
        addObject(new Stone(),71,854);
        addObject(new Stone(),324,417);
        addObject(new Stone(),452,417);
        addObject(new Stone(),68,267);
        addObject(new Stone(),495,41);
        addObject(new Stone(),627,41);
        addObject(new Stone(),285,122);
        addObject(new Security(),467,-27);
        addObject(new Stone(),65,-190);
        addObject(new Stone(),198,-167);
        addObject(new Stone(),330,-166);
        addObject(new Security(),169,-225);
        addObject(new Stone(),643,-487);
        addObject(new Stone(),775,-487);
        addObject(new Stone(),1036,-488);
        addObject(new Oppenheimer(),780,-545);
        addObject(new Stone(),209,-374);
        addObject(new Stone(),423,-447);
        addObject(new Stone(),614,-134);
        addObject(new Stone(),911,-487);
        addObject(new Plant(),268,371);
        addObject(new Cactus(),518,377);
        addObject(new Plant(),442,-6);
        addObject(new Cactus(),688,3);
        addObject(new Plant(),144,-212);
        addObject(new Cactus(),392,-203);

        addObject(new Cactus(),150,-407);
        addObject(new Plant(),1025,-535);
        addObject(new Cactus(),225,93);
        addObject(new Plant(),11,1325);
        addObject(new Security(),289,350);
        addObject(new Business(),562,-198);
        addObject(new Business(),25,203);
        addObject(new Stone(),68,568);
    }
}
