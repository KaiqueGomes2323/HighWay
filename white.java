import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class white here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class white extends Actor
{
    /**
     * Act - do whatever the white wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        colision();
        contarGas();
        getWorld().showText("gas: "+gas, 75, 35);
    }
    int velocidade = 5;
    public void movement(){
        if(Greenfoot.isKeyDown("left")){
            setLocation( getX() - velocidade , getY() );
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation( getX() + velocidade , getY() );
        }
    }
    
    public void colision(){
        if( getOneIntersectingObject(red.class) != null){
            Greenfoot.stop();
            getWorld().showText("Você bateu!", 200, 300);
        }
        if( getOneIntersectingObject(blue.class) != null){
            Greenfoot.stop();
            getWorld().showText("Você bateu!", 200, 300);
        }
        if( getOneIntersectingObject(green.class) != null){
            Greenfoot.stop();
            getWorld().showText("Você bateu!", 200, 300);
        }
    }
    int gas = 0;
    public void contarGas()
    {
       if( isTouching(gas.class) ){
           gas++;
       }
    }
}
