import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)
import java.util.Random;

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
      Crab crab = new Crab();
      button b1 = new button();
      addObject(crab, 300, 300);
      addObject(b1, 50, 50);
            
    }
}

