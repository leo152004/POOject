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

        Stone stone1000 = new Stone();
        addObject(stone1000,305,1374);
        Stone stone1001 = new Stone();
        addObject(stone1001,439,1346);
        Stone stone1002 = new Stone();
        addObject(stone1002,575,1319);
        Stone stone1003 = new Stone();
        addObject(stone1003,711,1288);
        Stone stone1004 = new Stone();
        addObject(stone1004,72,1291);
        Stone stone1005 = new Stone();
        addObject(stone1005,848,1258);
        Stone stone1006 = new Stone();
        addObject(stone1006,984,1227);
        Stone stone1007 = new Stone();
        addObject(stone1007,987,1400);
        Stone stone1008 = new Stone();
        addObject(stone1008,1130,1317);
        stone1007.setLocation(984,1432);
        stone1008.setLocation(1114,1360);
        stone1008.setLocation(1114,1359);
        stone1007.setLocation(977,1421);
        removeObject(stone1007);
        Stone stone1009 = new Stone();
        addObject(stone1009,286,1149);
        Stone stone1010 = new Stone();
        addObject(stone1010,72,963);
        Stone stone1011 = new Stone();
        addObject(stone1011,587,1048);
        Stone stone1012 = new Stone();
        addObject(stone1012,723,1049);
        stone1012.setLocation(722,1044);
        Stone stone1013 = new Stone();
        addObject(stone1013,972,999);
        Stone stone1014 = new Stone();
        addObject(stone1014,1132,903);
        Plant plant10 = new Plant();
        addObject(plant10,886,1210);
        Plant plant11 = new Plant();
        addObject(plant11,21,918);
        plant11.setLocation(38,922);
        plant11.setLocation(39,923);
        Cactus cactus10 = new Cactus();
        addObject(cactus10,656,1011);
        Stone stone1015 = new Stone();
        addObject(stone1015,400,865);
        Stone stone1016 = new Stone();
        addObject(stone1016,230,705);
        Stone stone1017 = new Stone();
        addObject(stone1017,536,836);
        Stone stone1018 = new Stone();
        addObject(stone1018,672,836);
        Stone stone1019 = new Stone();
        addObject(stone1019,487,635);
        Stone stone1020 = new Stone();
        addObject(stone1020,927,746);
        Plant plant13 = new Plant();
        addObject(plant13,881,696);
        Stone stone1021 = new Stone();
        addObject(stone1021,429,343);
        Stone stone1022 = new Stone();
        addObject(stone1022,564,343);
        Stone stone1023 = new Stone();
        addObject(stone1023,698,344);
        Stone stone1024 = new Stone();
        addObject(stone1024,831,345);
        stone1024.setLocation(826,346);
        stone1024.setLocation(825,344);
        Plant plant14 = new Plant();
        addObject(plant14,555,298);
        Cactus cactus12 = new Cactus();
        addObject(cactus12,733,307);
        Plant plant15 = new Plant();
        addObject(plant15,282,659);
        Stone stone1025 = new Stone();
        addObject(stone1025,71,548);
        Stone stone1026 = new Stone();
        addObject(stone1026,772,539);
        Stone stone1027 = new Stone();
        addObject(stone1027,1128,577);
        Stone stone1028 = new Stone();
        addObject(stone1028,972,455);
        Cactus cactus13 = new Cactus();
        addObject(cactus13,539,594);
        cactus13.setLocation(480,793);
        Cactus cactus14 = new Cactus();
        addObject(cactus14,1183,536);
        Stone stone1029 = new Stone();
        addObject(stone1029,301,450);
        Stone stone1031 = new Stone();
        addObject(stone1031,170,172);
        stone1031.setLocation(188,220);
        Stone stone1032 = new Stone();
        addObject(stone1032,995,180);
        Bussiness bussiness10 = new Bussiness();
        addObject(bussiness10,444,1276);
        bussiness10.setLocation(974,1147);
        Bussiness bussiness12 = new Bussiness();
        addObject(bussiness12,399,797);
        Bussiness bussiness13 = new Bussiness();
        addObject(bussiness13,929,673);
        bussiness13.setLocation(923,688);
        bussiness13.setLocation(917,684);
        bussiness13.setLocation(915,679);
        bussiness13.setLocation(914,678);
        bussiness12.setLocation(513,774);
        Bussiness bussiness14 = new Bussiness();
        addObject(bussiness14,247,1086);

        bussiness10.setLocation(257,1086);
        
        bussiness14.setLocation(988,1159);
    }
}
