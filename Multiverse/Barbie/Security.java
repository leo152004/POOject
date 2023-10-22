import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Security here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Security extends Enemies
{
    
    private GreenfootImage security1, security2;
    public boolean flip; //define se a imagem esta invertida ou nao
    public int flipCounter; // contador para mudar a imagem
    public int imageFliped; //qual a imagem a ser usado
    public int direction = 1;
    GreenfootImage security = getImage();
    public Security(){
        security1 = new GreenfootImage("secure1.png");
        security2 = new GreenfootImage("secure2.png");
    }
    public void act()
    {
        moveImage(security,security1,security2);
        move();
        gravity();
        atGround();
    }
    private void move(){
        if ((direction == 1 && isTouching(Cactus.class)) || (direction == -1 && isTouching(Plant.class))) 
            direction = -direction;
        move(direction);
    }
    public void moveImage(GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(flipCounter == 10){
            if(imageFliped == 0){
                setImage(walk1);
                imageFliped = 1;
            } else if (imageFliped == 1){
                setImage(base);
                imageFliped = 2;
            }else if (imageFliped == 2){
                setImage(walk2);
                imageFliped = 3;
            }else{
                setImage(base);
                imageFliped = 0;
            }
            flipCounter = 0;
        }
        flipCounter++;
        
        if(isTouching(Cactus.class)){
            if(!flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = true;
                
            }
        }
        if(isTouching(Plant.class)){
            if(flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = false;
                
            }
        }
    }
}
