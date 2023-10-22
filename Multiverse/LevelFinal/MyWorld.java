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
        super(1200, 1600, 1, false); 
        pisoDePedra();
        setBackground("trinity.png");
        decoracao();
        //levellayers();
        prepare();
        addObject(new Barbie(),200, 1507);
        
    }
    

    public void pisoDePedra()
    {
        for(int i = 0; i < getWidth(); i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Stone(), i, 1547);
            addObject(new Stone(), i, 1570);
            addObject(new Stone(), i, 1590);
            addObject(new Stone(), i, 1600);
            
        }
    }

    public void decoracao(){
        addObject(new Cactus(),getWidth()/2, 1507);
        addObject(new Cactus(),getWidth()-100, 1507);
        addObject(new Cactus(),getWidth()-1100, 1507);
        addObject(new Plant(),getWidth()/3, 1507);
        addObject(new Plant(),getWidth()-300, 1507);
        addObject(new Plant(),getWidth()-1000, 1507);
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
        Stone stone5000 = new Stone();
        addObject(stone5000,71,1354);
        Stone stone5002 = new Stone();
        addObject(stone5002,324,1217);
        Stone stone5003 = new Stone();
        addObject(stone5003,452,1217);
        Security security50 = new Security();
        addObject(security50,271,1151);
        Stone stone5004 = new Stone();
        addObject(stone5004,68,1067);
        Stone stone5005 = new Stone();
        addObject(stone5005,495,841);
        Stone stone5006 = new Stone();
        addObject(stone5006,627,841);
        Stone stone5007 = new Stone();
        addObject(stone5007,285,922);
        Security security52 = new Security();
        addObject(security52,467,773);
        Stone stone5008 = new Stone();
        addObject(stone5008,65,610);
        Stone stone5009 = new Stone();
        addObject(stone5009,198,633);
        Stone stone5010 = new Stone();
        addObject(stone5010,330,634);
        Security security53 = new Security();
        addObject(security53,169,575);
        Stone stone5011 = new Stone();
        addObject(stone5011,643,313);
        Stone stone5012 = new Stone();
        addObject(stone5012,775,313);
        Stone stone5013 = new Stone();
        addObject(stone5013,909,315);
        stone5013.setLocation(909,311);
        stone5013.setLocation(909,307);
        Stone stone5014 = new Stone();
        addObject(stone5014,1036,312);
        Oppenheimer oppenheimer50 = new Oppenheimer();
        addObject(oppenheimer50,780,255);
        Business business50 = new Business();
        addObject(business50,843,251);
        Business business52 = new Business();
        addObject(business52,714,254);
        Stone stone5015 = new Stone();
        addObject(stone5015,205,453);
        stone5015.setLocation(161,448);
        stone5015.setLocation(209,426);
        Stone stone5016 = new Stone();
        addObject(stone5016,423,353);
        Stone stone5017 = new Stone();
        addObject(stone5017,614,666);
        stone5013.setLocation(911,313);
        Plant plant = new Plant();
        addObject(plant,268,1171);
        Cactus cactus = new Cactus();
        addObject(cactus,510,1181);
        cactus.setLocation(518,1177);
        Plant plant2 = new Plant();
        addObject(plant2,442,794);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,688,803);
        Plant plant3 = new Plant();
        addObject(plant3,144,588);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,392,597);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,150,393);
        Plant plant4 = new Plant();
        addObject(plant4,1025,265);
        Cactus cactus5 = new Cactus();
        addObject(cactus5,225,893);
        Plant plant5 = new Plant();
        addObject(plant5,21,1318);
        plant5.setLocation(11,1325);
        security50.setLocation(289,1150);
    }
}
