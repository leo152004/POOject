                    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Gravity
{
    private boolean jumping; //define se esta a saltar
    private boolean flip; //define se a imagem esta invertida ou nao
    private int jumpHeight;  //a altura que o player pode saltar
    private int flipCounter; // contador para mudar a imagem
    private int imageFliped; //qual a imagem a ser usada
    private World theLevel;

    public void movementManager(String right, String left, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2, String up){
        move(right, left, base, walk1, walk2);
        atGroundConfirm();
        jump(up);
        atGround();
        if(!getJumping())
            gravity();
        isDead();
        subindoNivel();
        youWon();
        theEnd();
        dontGoUp();
    }

    public void move(String right, String left, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
        if(Greenfoot.isKeyDown(right)){
            move(5);
        }
        if(Greenfoot.isKeyDown(right))
            moveImage(left, right, base, walk1, walk2);
        if(Greenfoot.isKeyDown(left)){
            move(-5);
        }
        if(Greenfoot.isKeyDown(left))
            moveImage(left, right, base, walk1, walk2);

        if(!(Greenfoot.isKeyDown(left) || Greenfoot.isKeyDown(right))){
            setImage(base);
            imageFliped = 0;
        }
    }

    public void moveImage(String left, String right, GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2){
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
        flipImage(base, walk1, walk2, left, right);
    }

    private void flipImage(GreenfootImage base, GreenfootImage walk1, GreenfootImage walk2, String left, String right){
        if(Greenfoot.isKeyDown(left)){
            if(!flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = true;
            }
        }
        if(Greenfoot.isKeyDown(right)){
            if(flip){
                base.mirrorHorizontally();
                walk1.mirrorHorizontally();
                walk2.mirrorHorizontally();
                flip = false;
            }
        }
    }

    public void jump(String up){
        if(Greenfoot.isKeyDown(up) && getFalling() == false && jumping == false){
            jumping = true;
            jumpHeight = 20;
            setLocation(getX(), getY()-jumpHeight);
        }
        else if (jumping == true && getFalling() == false){
            jumpHeight--;
            setLocation(getX(), getY()-jumpHeight);
        }
        jumpStop();
    }

    public void dontGoUp(){
        if(isTouching(Stone.class))
            jumpStop();
    }

    private void jumpStop(){
        if (jumping == true && jumpHeight <= 0){
            jumping = false;
            setFalling(true);
        }
    }

    public boolean getJumping(){
        return jumping;
    }

    public void isDead(){
        if(isTouching(Security.class) || getY() >= 799){
            World theLevel = getWorld();
            if (theLevel instanceof Level0)
                ((Level0)theLevel).death(this);
            if (theLevel instanceof Level1)
                ((Level1)theLevel).death(this);
            if (theLevel instanceof Level2)
                ((Level2)theLevel).death(this);
            if (theLevel instanceof Level3)
                ((Level3)theLevel).death(this);
            if (theLevel instanceof Level4)
                ((Level4)theLevel).death(this);
        } 
    }
    
    

    public void youWon(){
        if(isTouching(Special.class)){
            getWorld().addObject(new NextLevel(), 600, 400);
            Level level = getWorldOfType(Level.class);
            addPoints(level);
            getWorld().showText("" + level.getPontos(), 825, 292);
            Greenfoot.delay(200);
            NextLevel next = getWorld().getObjects(NextLevel.class).get(0);
            getWorld().removeObject(next);
            if (getWorld() instanceof Level0){
                level.jukebox("stop", "entrance");
                Greenfoot.setWorld(new Level1());
            }
            if (getWorld() instanceof Level1){
                level.jukebox("stop", "normal");
                Greenfoot.setWorld(new Level2());
            }
            if (getWorld() instanceof Level2)
                Greenfoot.setWorld(new Level3());
            if (getWorld() instanceof Level3)
                Greenfoot.setWorld(new Level4());
        }
    }

    public void subindoNivel(){
        World world = getWorldOfType(Level.class);
        if (world != null){
            descendo();
        }
    }

    public void atGroundConfirm(){
        List<Ground> platforms = getObjectsInRange(getImage().getHeight()/2 + 5, Ground.class);
        if(!platforms.isEmpty() && !(platforms.get(0).getY() == getY())){
            setLocation(getX(), getY()-5);
        }
    }

    public void theEnd(){
        if(isTouching(Oppenheimer.class))
            Greenfoot.setWorld(new EndScreen());
    }

    private void addPoints(Level level){
        level.addPoints();
    }
}
