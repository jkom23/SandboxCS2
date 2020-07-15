import greenfoot.*;
import java.util.List;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor{
    int hp = 10;
    public void act()
    {
       MouseInfo m = Greenfoot.getMouseInfo();
       if(m!= null){
           turnTowards(m.getX(), m.getY());
        }
    move(2);
    if(isTouching(button.class)){
       // List<button> buttons = getNeighbours(5, true, button.class);
       // for(button b : buttons){
            hp--;
        
}
//} if (!b.isAlive()){
   //removeTouching(button.class);
//}

    }
}

