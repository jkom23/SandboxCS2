import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
        World myWorld = getWorld();
        List<Crab> crabs = myWorld.getObjects(Crab.class);
        for(Crab c : crabs){
           // int y =  Greenfoot.getRandomNumber(560);
           // int x =  Greenfoot.getRandomNumber(560);
            //c.setLocation(x,y);
           // myWorld.removeObjects(crabs);
        }
        
        /*
        Crab c = new Crab();
        int y =  Greenfoot.getRandomNumber(560);
        int x =  Greenfoot.getRandomNumber(560);
        myWorld.addObject(c, x, y);
        */
       
    }
}
}