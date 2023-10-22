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
        setBackground("BackgroundLevel.png");
        decoracao();
        //levellayers();
        prepare();
        addObject(new Barbie(),200, 1507);
    }

    public void pisoDePedra()
    {
        for(int i = 0; i < getWidth(); i += 96){ //fazer addObject em vez do setLocation no MovingWorld, e usar um bollean para ter a certeza
            addObject(new Stone(), i, 1547);
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

        Stone stone4000 = new Stone();
        addObject(stone4000,71,1384);
        Stone stone4002 = new Stone();
        addObject(stone4002,208,1357);
        removeObject(stone4000);
        Stone stone4001 = new Stone();
        addObject(stone4001,72,1327);
        Stone stone4003 = new Stone();
        addObject(stone4003,425,1200);
        Stone stone4004 = new Stone();
        addObject(stone4004,559,1200);
        Stone stone4005 = new Stone();
        addObject(stone4005,693,1200);
        Security security40 = new Security();
        addObject(security40,388,1139);
        Stone stone4006 = new Stone();
        addObject(stone4006,925,1347);
        Stone stone4007 = new Stone();
        addObject(stone4007,1132,1209);
        Stone stone4008 = new Stone();
        addObject(stone4008,828,1171);
        Plant plant400 = new Plant();
        addObject(plant400,783,1127);
        Cactus cactus400 = new Cactus();
        addObject(cactus400,16,1292);
        Stone stone4009 = new Stone();
        addObject(stone4009,199,1056);
        Stone stone4010 = new Stone();
        addObject(stone4010,71,871);
        Stone stone4011 = new Stone();
        addObject(stone4011,938,943);
        Stone stone4012 = new Stone();
        addObject(stone4012,1070,944);
        Stone stone4013 = new Stone();
        addObject(stone4013,1133,921);
        stone4013.setLocation(1141,918);
        Business business40 = new Business();
        addObject(business40,892,887);
        business40.setLocation(892,887);
        Plant plant402 = new Plant();
        addObject(plant402,1178,872);
        Cactus cactus402 = new Cactus();
        addObject(cactus402,1179,1170);
        Stone stone4014 = new Stone();
        addObject(stone4014,360,939);
        stone4014.setLocation(427,915);
        Stone stone4015 = new Stone();
        addObject(stone4015,531,890);
        Stone stone4017 = new Stone();
        addObject(stone4017,319,699);
        Stone stone4018 = new Stone();
        addObject(stone4018,453,671);
        Stone stone4019 = new Stone();
        addObject(stone4019,743,740);
        Stone stone4020 = new Stone();
        addObject(stone4020,983,657);
        Stone stone4021 = new Stone();
        addObject(stone4021,1119,656);
        Stone stone4022 = new Stone();
        addObject(stone4022,783,490);
        Stone stone4023 = new Stone();
        addObject(stone4023,647,461);
        Stone stone4024 = new Stone();
        addObject(stone4024,513,462);
        stone4024.setLocation(533,470);
        stone4024.setLocation(543,467);
        Plant plant403 = new Plant();
        addObject(plant403,358,653);
        Cactus cactus403 = new Cactus();
        addObject(cactus403,451,880);
        Plant plant404 = new Plant();
        addObject(plant404,739,448);
        Security security402 = new Security();
        addObject(security402,939,595);
        Business business402 = new Business();
        addObject(business402,472,400);
        Stone stone4025 = new Stone();
        addObject(stone4025,389,263);
        Stone stone4026 = new Stone();
        addObject(stone4026,521,264);
        stone4026.setLocation(514,259);
        stone4026.setLocation(514,259);
        Stone stone4027 = new Stone();
        addObject(stone4027,649,264);
        Stone stone4028 = new Stone();
        addObject(stone4028,780,263);
        Plant plant405 = new Plant();
        addObject(plant405,507,215);
        Cactus cactus404 = new Cactus();
        addObject(cactus404,631,225);
        Stone stone4029 = new Stone();
        addObject(stone4029,67,498);
        Stone stone4030 = new Stone();
        addObject(stone4030,1066,379);
        Stone stone4031 = new Stone();
        addObject(stone4031,200,499);
        Security security403 = new Security();
        addObject(security403,27,436);
        Stone stone4032 = new Stone();
        addObject(stone4032,128,266);
        Stone stone4033 = new Stone();
        addObject(stone4033,1130,236);
        stone4030.setLocation(990,391);
        stone4033.setLocation(1138,261);
        Cactus cactus405 = new Cactus();
        addObject(cactus405,1038,356);
        Cactus cactus406 = new Cactus();
        addObject(cactus406,76,232);
        stone4024.setLocation(528,461);
        stone4026.setLocation(545,259);
        stone4025.setLocation(413,259);
        stone4027.setLocation(659,259);
        stone4028.setLocation(765,259);
        Stone stone4034 = new Stone();
        addObject(stone4034,709,1010);
        stone4034.setLocation(719,1004);
        stone4034.setLocation(689,1004);
        Business business403 = new Business();
        addObject(business403,478,827);
        
        Plant plant46 = new Plant();
        addObject(plant46,13,454);
        Plant plant47 = new Plant();
        addObject(plant47,931,615);
        Plant plant48 = new Plant();
        addObject(plant48,370,1157);
        Cactus cactus47 = new Cactus();
        addObject(cactus47,1182,620);
        Cactus cactus48 = new Cactus();
        addObject(cactus48,752,1167);
        Cactus cactus49 = new Cactus();
        addObject(cactus49,261,461);
    }
}
