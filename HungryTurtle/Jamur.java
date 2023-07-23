import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jamur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jamur extends Actor
{
    /**
     * Act - do whatever the Jamur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer;
    int maxtime;
    public Jamur(int maxtime)
    {
        setImage("Jamur.png");
        timer = 0;
        maxtime = 250-Greenfoot.getRandomNumber(50);
        this.maxtime = maxtime;
    }
    public void act()
    {
        resetJamur();// Add your action code here.
    }
    public void resetJamur ()
    {
        timer++;
     if (timer > maxtime)
     {
       timer = 0;
       setLocation(Greenfoot.getRandomNumber(500)+70, Greenfoot.getRandomNumber(350)+100);
     }
    }

    }

