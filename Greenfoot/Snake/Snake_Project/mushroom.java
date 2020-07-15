import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class mushroom extends Actor
{
   
    
    public snake snake;
    
    public mushroom(snake snake){
        this.snake = snake;
    }  
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
     //if the mushroom touches the snake, relocate to random area and increase score
     Random r = new Random();
     if (intersects(snake)){
         setLocation(r.nextInt(650), r.nextInt(650));
     //Note: it is purposeful that random ints are > than 501 in order to increase chances of mushroom being at edge
     //thus increasing difficulty for the user
         MyWorld.setScore();
         
         
         
       }
    }    
}
