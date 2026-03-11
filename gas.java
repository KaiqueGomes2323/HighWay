import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class gas extends Actor
{
    public void act()
    {
        getImage().scale( 30 , 30 );
        movement();
        collision();
    }
    int[] nums = new int[] { 75 , 250 , 325 , 500 };
    public void movement()
    {
        setLocation( getX() , getY() + 5 );
        if( getY() >= 600 ){
            setLocation( nums[ Greenfoot.getRandomNumber(4) ] , -50 );
        }
    }
    
        public void collision()
    {
        if(getOneIntersectingObject(white.class) != null){
    
            MyWorld w = (MyWorld) getWorld();
            w.addScore();
    
            setLocation(nums[Greenfoot.getRandomNumber(4)], -50);
        }
    }
}
