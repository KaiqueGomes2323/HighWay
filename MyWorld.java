import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1, false); 
        
        white w = new white();
        addObject(w, 200, 500);
        
        blue b = new blue();
        addObject(b, 75, -50);
        
        red r = new red();
        addObject(r, 150, -50);
        
        gas g = new gas();
        addObject(g, 240, -50);
        
        green gr = new green();
        addObject(gr, 325, -50);
        
        geradorGas();
    }
    int altura = 5;
    public void geradorGas(){
        gas gas[] = new gas[12];
        for(int i=0; i<12; i++){
            gas[i] = new gas();
            addObject( gas[i],
               Greenfoot.getRandomNumber(400),
                  altura);
            altura += 50;
        }
    }
    
    int score = 0;
    public void addScore()
    {
        score++;
        showText("Score: " + score, 60, 20);
    }
}
