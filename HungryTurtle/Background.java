import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    static Counter counter = new Counter("Score : ");
    static Counter counter2 = new Counter ("HP : ");
    GreenfootSound suara=new GreenfootSound("bg.wav");
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400,1);
        setBackground("Background.png");
        Greenfoot.playSound("bg.wav");
        suara.playLoop();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
           addObject(new Boom(), Greenfoot.getRandomNumber(400), 10);
        }
    }
    private void prepare()
    {
        int i = 0;
        while (i < 2)
        {
           addObject (new Boom(),(Greenfoot.getRandomNumber(400)), 10); 
           i = i+1;
        }
        
        int b = 0; 
        while (b < 3)
        {
           addObject (new Jamur(150),(Greenfoot.getRandomNumber(400)+150) ,(Greenfoot.getRandomNumber(400)+100)); 
           b = b+1;
        }
        addObject (new KuraKura(), 400, 500);
        
        addObject(counter,52,22);
        counter.setValue(0);
        addObject(counter2, 247,18);
        counter2.setLocation(550,22);
        counter2.setValue(5);
    }

}
