import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   //sets up necessary variables
   public static int score = 0;
   public static boolean loss = false;
   public snake snake;
   
    
    public MyWorld()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        //runs prepare and act
        super(500, 500, 1); 
        prepare();
        act();
        
        
        
        
        
    }
    
        public void act(){
        //shows the score
        showText("Score: "+ score, 55, 30);
        endGame();
        
    }
    public void endGame(){
        //if you touch the edge, show game over, reset the score, and end the game
        if (loss){
            showText("Game Over! Press \"Reset\" to play again", 250, 250);
            score=0;
            Greenfoot.delay(600);
            showText("", 250, 250);
            loss = false;
            Greenfoot.stop();
        }
    }
    //increases score
    public static void setScore(){
        MyWorld.score++;
    }
   
    private void prepare(){
    //sets up random
     Random r = new Random();
     //makes a new snake on the garden and adds it to world
     snake snake1 = new snake();
     addObject(snake1, 250, 250);
     //creates a new mushroom in a random position and adds it to world
     mushroom mushroom1 = new mushroom(snake1);
     addObject(mushroom1,r.nextInt(650), r.nextInt(650));
     //Note: it is purposeful that random ints are > than 501 in order to increase chances of mushroom being at edge
     //thus increasing difficulty for the user
            
    }
}
