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
        stone3014.setLocation(838,219);
        removeObject(stone3014);
        Stone stone3035 = new Stone();
        addObject(stone3014,813,218);
        Plant plant40 = new Plant();
        addObject(plant40,73,1351);
        Cactus cactus40 = new Cactus();
        addObject(cactus40,304,1362);
        plant40.setLocation(73,1327);
        Security security40 = new Security();
        addObject(security40,73,1332);
        plant40.setLocation(70,1350);
        Plant plant42 = new Plant();
        addObject(plant42,683,942);
        Cactus cactus42 = new Cactus();
        addObject(cactus42,939,952);
        plant42.setLocation(680,945);
        Security security42 = new Security();
        addObject(security42,700,927);
        Plant plant43 = new Plant();
        addObject(plant43,383,726);
        Cactus cactus43 = new Cactus();
        addObject(cactus43,624,735);
        plant43.setLocation(389,722);
        Security security43 = new Security();
        addObject(security43,389,707);
        Plant plant44 = new Plant();
        addObject(plant44,317,388);
        Cactus cactus44 = new Cactus();
        addObject(cactus44,561,397);
        plant44.setLocation(315,390);
        Security security44 = new Security();
        addObject(security44,325,370);
        Plant plant45 = new Plant();
        addObject(plant45,259,1044);
        Plant plant46 = new Plant();
        addObject(plant46,26,804);
        Plant plant47 = new Plant();
        addObject(plant47,1021,426);
        Plant plant48 = new Plant();
        addObject(plant48,571,171);
        Cactus cactus45 = new Cactus();
        addObject(cactus45,699,182);
        Cactus cactus46 = new Cactus();
        addObject(cactus46,1188,275);
        Plant plant49 = new Plant();
        addObject(plant49,1181,755);
        Cactus cactus47 = new Cactus();
        addObject(cactus47,903,1242);
        Plant plant440 = new Plant();
        addObject(plant440,1043,1197);
        Cactus cactus48 = new Cactus();
        addObject(cactus48,162,848);
    }
}
