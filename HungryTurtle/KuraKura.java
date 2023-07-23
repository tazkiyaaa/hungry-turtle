import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KuraKura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KuraKura extends Actor
{
    /**
     * Act - do whatever the KuraKura wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer=0;
    public KuraKura()
    {
        setImage("KuraKura.png");
    }
    public void act()
    {
        gerak();
        tabrakBoom();
        makanJamur();
    }
    public void tabrakBoom()
    {
    if (isTouching(Boom.class)){
        removeTouching(Boom.class);
        getWorld().addObject(new Boom(),500,150);
        Background.counter2.add(-1);
        if (Background.counter2.getValue()==0){
        getWorld().addObject(new GameOver(), 300,120);
        Greenfoot.stop();
        Greenfoot.playSound("gameover.mp3");
        }
    }
    }
    public void gerak()
    {
        if (Greenfoot.isKeyDown("left")){
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")){
            move(2);
        }
        else{
            move(2);
        }// Add your action code here.
    }
    public void makanJamur()
    {
        if (isTouching(Jamur.class))
    {
        removeTouching(Jamur.class);
        getWorld().addObject (new Jamur(250), (Greenfoot.getRandomNumber(650)+70), (Greenfoot.getRandomNumber(450)+70));
        Background.counter.add(10);
    }
}
}
