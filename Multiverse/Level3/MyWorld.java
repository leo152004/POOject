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

        Stone stone3000 = new Stone();
        addObject(stone3000,127,1396);
        Stone stone3002 = new Stone();
        addObject(stone3002,247,1396);
        Stone stone3003 = new Stone();
        addObject(stone3003,384,1369);
        Security security10 = new Security();
        addObject(security10,84,1333);
        Stone stone3004 = new Stone();
        addObject(stone3004,69,1172);
        Stone stone3005 = new Stone();
        addObject(stone3005,518,1342);
        Stone stone3006 = new Stone();
        addObject(stone3006,854,1273);
        Stone stone3007 = new Stone();
        addObject(stone3007,985,1246);
        Stone stone3008 = new Stone();
        addObject(stone3008,1130,1381);
        Security security12 = new Security();
        addObject(security12,807,1209);
        Plant plant200 = new Plant();
        addObject(plant200,479,1296);
        Stone stone3009 = new Stone();
        addObject(stone3009,314,1093);
        Stone stone3010 = new Stone();
        addObject(stone3010,449,1065);
        Stone stone3011 = new Stone();
        addObject(stone3011,423,219);
        Stone stone3012 = new Stone();
        addObject(stone3012,555,219);
        Stone stone3013 = new Stone();
        addObject(stone3013,687,221);
        stone3013.setLocation(690,220);
        stone3013.setLocation(689,218);
        Stone stone3014 = new Stone();
        addObject(stone3014,809,220);
        stone3014.setLocation(822,223);
        Stone stone3015 = new Stone();
        addObject(stone3015,1129,1077);
        Stone stone3016 = new Stone();
        addObject(stone3016,639,1180);
        Stone stone3017 = new Stone();
        addObject(stone3017,740,990);
        Stone stone3018 = new Stone();
        addObject(stone3018,875,990);
        Stone stone3019 = new Stone();
        addObject(stone3019,167,908);
        Stone stone3020 = new Stone();
        addObject(stone3020,66,880);
        stone3019.setLocation(148,915);
        stone3019.setLocation(148,911);
        stone3019.setLocation(148,908);
        stone3019.setLocation(144,895);
        removeObject(stone3020);
        stone3019.setLocation(78,849);
        Stone stone30021 = new Stone();
        addObject(stone30021,177,884);
        Stone stone3021 = new Stone();
        addObject(stone3021,437,769);
        Stone stone3022 = new Stone();
        addObject(stone3022,562,769);
        Stone stone3023 = new Stone();
        addObject(stone3023,1037,824);
        stone3023.setLocation(1194,800);
        stone3023.setLocation(1138,798);
        Stone stone3024 = new Stone();
        addObject(stone3024,1038,820);
        Stone stone3025 = new Stone();
        addObject(stone3025,825,671);
        Plant plant300 = new Plant();
        addObject(plant300,1096,1031);
        Plant plant301 = new Plant();
        addObject(plant301,156,842);
        Security security13 = new Security();
        addObject(security13,405,714);
        security13.setLocation(397,711);
        Plant plant304 = new Plant();
        addObject(plant304,782,633);
        Cactus cactus30 = new Cactus();
        addObject(cactus30,363,1059);
        Cactus cactus302 = new Cactus();
        addObject(cactus302,808,952);
        Plant plant305 = new Plant();
        addObject(plant305,526,175);
        Cactus cactus303 = new Cactus();
        addObject(cactus303,659,186);
        Stone stone27 = new Stone();
        addObject(stone27,192,579);
        Stone stone28 = new Stone();
        addObject(stone28,67,396);
        Stone stone29 = new Stone();
        addObject(stone29,502,431);
        Stone stone30 = new Stone();
        addObject(stone30,371,431);
        Stone stone31 = new Stone();
        addObject(stone31,1131,310);
        Stone stone32 = new Stone();
        addObject(stone32,966,470);
        Plant plant306 = new Plant();
        addObject(plant306,914,426);
        plant306.setLocation(1116,344);
        removeObject(plant306);
        Plant plant307 = new Plant();
        addObject(plant307,1174,268);
        Cactus cactus304 = new Cactus();
        addObject(cactus304,318,400);
        cactus304.setLocation(114,366);
        Security security14 = new Security();
        addObject(security14,340,370);
        stone3014.setLocation(838,219);
        removeObject(stone3014);
        Stone stone3035 = new Stone();
        addObject(stone3014,813,218);
    }
}
