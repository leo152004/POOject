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
        Stone stone = new Stone();
        addObject(stone,986,1403);
        Stone stone2 = new Stone();
        addObject(stone2,850,1403);
        Stone stone3 = new Stone();
        addObject(stone3,610,1403);
        Stone stone4 = new Stone();
        addObject(stone4,474,1402);
        removeObject(stone4);
        Stone stone40 = new Stone();
        addObject(stone4,396,1406);
        Stone stone5 = new Stone();
        addObject(stone5,738,1250);
        Stone stone6 = new Stone();
        addObject(stone6,764,1437);
        removeObject(stone6);
        Stone stone60 = new Stone();
        addObject(stone6,600,1220);
        Stone stone7 = new Stone();
        addObject(stone7,336,1248);
        Stone stone8 = new Stone();
        addObject(stone8,259,1407);
        removeObject(stone8);
        Stone stone80 = new Stone();
        addObject(stone80,259,1407);
        removeObject(stone8);
        Stone stone81 = new Stone();
        addObject(stone81,261,1406);
        Stone stone9 = new Stone();
        addObject(stone9,72,1240);
        Stone stone10 = new Stone();
        addObject(stone10,1123,1294);
        Stone stone11 = new Stone();
        addObject(stone11,940,1176);
        Stone stone12 = new Stone();
        addObject(stone12,236,1109);
        Stone stone13 = new Stone();
        addObject(stone13,371,1079);
        Stone stone14 = new Stone();
        addObject(stone14,66,951);
        Stone stone15 = new Stone();
        addObject(stone15,1075,1176);
        Stone stone16 = new Stone();
        addObject(stone16,767,1057);
        Stone stone17 = new Stone();
        addObject(stone17,560,935);
        Stone stone18 = new Stone();
        addObject(stone18,901,1025);
        Stone stone19 = new Stone();
        addObject(stone19,1130,1068);
        Stone stone20 = new Stone();
        addObject(stone20,1030,901);
        stone20.setLocation(1067,952);
        removeObject(stone20);
        Stone stone201 = new Stone();
        addObject(stone201,696,934);
        removeObject(stone20);
        Stone stone202 = new Stone();
        addObject(stone202,693,935);
        Stone stone21 = new Stone();
        addObject(stone21,324,863);
        Stone stone22 = new Stone();
        addObject(stone22,130,774);
        stone14.setLocation(61,955);
        stone14.setLocation(39,952);
        stone14.setLocation(55,963);
        Stone stone23 = new Stone();
        addObject(stone23,1043,883);
        Stone stone24 = new Stone();
        addObject(stone24,788,775);
        Stone stone25 = new Stone();
        addObject(stone25,498,690);
        Stone stone26 = new Stone();
        addObject(stone26,362,657);
        Stone stone27 = new Stone();
        addObject(stone27,226,623);
        Stone stone28 = new Stone();
        addObject(stone28,666,523);
        Stone stone29 = new Stone();
        addObject(stone29,393,166);
        Stone stone30 = new Stone();
        addObject(stone30,529,166);
        Stone stone31 = new Stone();
        addObject(stone31,664,167);
        removeObject(stone31);
        Stone stone311 = new Stone();
        addObject(stone311,663,165);
        Stone stone32 = new Stone();
        addObject(stone32,799,165);
        Stone stone33 = new Stone();
        addObject(stone33,1003,674);
        stone33.setLocation(1049,638);
        Stone stone34 = new Stone();
        addObject(stone34,408,424);
        Stone stone35 = new Stone();
        addObject(stone35,153,307);
        Stone stone36 = new Stone();
        addObject(stone36,801,494);
        Stone stone37 = new Stone();
        addObject(stone37,938,465);
        Stone stone38 = new Stone();
        addObject(stone38,1129,284);
        Stone stone39 = new Stone();
        addObject(stone39,674,321);
        Plant plant = new Plant();
        addObject(plant,76,721);
        removeObject(plant);
        Plant plant1 = new Plant();
        addObject(plant1,79,726);
        Plant plant2 = new Plant();
        addObject(plant2,844,443);
        Cactus cactus = new Cactus();
        addObject(cactus,448,385);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,521,124);
        Plant plant3 = new Plant();
        addObject(plant3,664,116);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,991,843);
        Plant plant4 = new Plant();
        addObject(plant4,283,1057);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,681,1202);
        removeObject(cactus4);
        Cactus cactus40 = new Cactus();
        addObject(cactus40,694,1212);
    }
}
