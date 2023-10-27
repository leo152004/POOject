import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Security here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Security extends Enemies
{
    private GreenfootImage enemy, enemy1, enemy2;
    private int flipCounter; // contador para mudar a imagem
    private int imageFliped; //qual a imagem a ser usado
    private int direction;
    public Security(){
        style();    
        direction = 1;
    }

    private void style(){
        if(Greenfoot.getRandomNumber(2) == 0){
            enemy = getImage();
            enemy1 = new GreenfootImage("secure1.png");
            enemy2 = new GreenfootImage("secure2.png");
        } else{
            enemy = new GreenfootImage("business.png");
            enemy1 = new GreenfootImage("business1.png");
            enemy2 = new GreenfootImage("business2.png");
        }
    }

    public void act()
    {
        moveImage(enemy,enemy1,enemy2);
        moving(direction);
        gravity();
        atGround();
    }
    
    public void moving(int speed){
        if ((direction == 1 && isTouching(Cactus.class)) || (direction == -1 && isTouching(Plant.class)) || isAtEdge()) 
            direction = -direction;
        move(direction);
    }
}
