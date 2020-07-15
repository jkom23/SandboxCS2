import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Board is where the game of TicTacToe takes place
 */
public class Board extends World {
  /* Fields */
  private int turnNum;   // keep track of which turn
  private int playerNum; // keep track of which player
  private int[] board;   // keep track of each cell
  private boolean gameOver;

  /**
   * Create an empty board with a size of 3x3 cells,
   * where each cell is 100 pixels.
   */
  public Board() {
    super(3, 3, 100);
    init();
  }

  /* Getters to pass information to Cell */
  public int getPlayerNum(){
    return playerNum;
  }

  public boolean getGameOver(){
    return gameOver;
  }

  // This sets up the board
  private void init() {
    // Initialize playerNum and turnNum

    // Populate the board with empty cells
    // Use: addObject(new Cell(this, id), x-coord, y-coord);
  }

  public void makeMove(int cellNum, int status){
    // What should this look like?
    // Fill in code
  }

  // Alternate whose turn it is
  private void alternatePlayer() {
    // Fill in code
  }

  private boolean checkWin(){
    boolean columnWin = checkColumns();
    boolean rowWin = checkRows();
    boolean diagWin = checkDiagonals();

    // What should you do with these booleans?

    return false;
  }

  private boolean checkColumns(){
    // Fill in code
    return false;
  }

  private boolean checkRows(){
    // Fill in code
    return false;
  }

  private boolean checkDiagonals(){
    // Fill in code
    return false;
  }

  private boolean checkTie(){
    // Fill in code
    // Use: showText("Tie!", 1, 1);
    return false;
  }
}
