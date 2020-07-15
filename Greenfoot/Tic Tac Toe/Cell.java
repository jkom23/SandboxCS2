import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cell is the individual square
 */
public class Cell extends Actor {
  // Images
  private GreenfootImage oImg;
  private GreenfootImage xImg;
  private GreenfootImage emptyImg;

  // Fields
  private static Board board;
  private int status; // -1 = empty, 0 = O, 1 = X
  private int id;

  // Constructor
  public Cell(Board board, int id){
    // Initialize the images and set image to empty
    setupImages();
    setImage(emptyImg);

    this.board = board; // link to the board
    this.id = id;
    this.status = -1;
  }

  private void setupImages() {
    oImg = new GreenfootImage("o.png");
    xImg = new GreenfootImage("x.png");
    emptyImg = new GreenfootImage("empty.png");
  }

  /**
   * Act - do whatever the Cell wants to do. This method is called whenever the
   * 'Act' or 'Run' button gets pressed in the environment.
   */
  public void act() {
    checkClick();
  }

  private void checkClick(){
    // Update cell when clicked and empty
    if (Greenfoot.mouseClicked(this) && status < 0){
      updateCell();
    }
  }

  private void updateCell(){
    // Don't update if game is over
    if (board.getGameOver()){
      return;
    }

    // Otherwise, set the image and status accordingly
    int player = board.getPlayerNum();
    if (player == 1){
      setImage(xImg);
      status = 1;
    }else{
      setImage(oImg);
      status = 0;
    }

    // Tell the board what's happening
    board.makeMove(id, status);
  }
}
