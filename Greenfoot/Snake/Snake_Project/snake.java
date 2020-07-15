import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
      //moves the snake
       move(2);
       //user input: If user presses down and snake is not down or up, it will go down
       if(Greenfoot.isKeyDown("down") && 
       this.getRotation() != 90 && this.getRotation() != 270)
      this.setRotation(90);
      //user input: If user presses up and snake is not down or up, it will go up
    else if(Greenfoot.isKeyDown("up") && 
    this.getRotation() != 270 && this.getRotation() != 90)
      this.setRotation(-90);
      //user input: If user presses left and snake is not left or right, it will go left
    else if(Greenfoot.isKeyDown("left") && 
    this.getRotation() != 0 && this.getRotation() != 180)
      this.setRotation(180);
      //user input: If user presses right and snake is not right or left, it will go right
    else if(Greenfoot.isKeyDown("right") && 
    this.getRotation() != 0 && this.getRotation() != 180)
      this.setRotation(0);
     
    else{}
       
    //if the snake is at the edge of the garden, loss is true (this activates an ending in world)
        if(isAtEdge()){
         MyWorld.loss=true;
        }       
       
}
}
