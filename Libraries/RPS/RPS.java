import java.util.Scanner;
import java.util.Random;

public class RPS {

  
  private static String[] MOVES = { "Rock", "Paper", "Scissors" };

  private static int playerMove(Scanner sc) {
    System.out.println("Please choose:");
    System.out.println("[0] Rock \t[1] Paper \t[2] Scissors \t[9] Quit");
    int move = sc.nextInt();
    while (!(move==0 || move==1
    || move==2 || move==9)) { 
      System.out.println("Invalid input! Please choose:");
      System.out.println("[0] Rock \t[1] Paper \t[2] Scissors \t[9] Quit");
      move = sc.nextInt();
    }
    return move;
  }

  private static void checkWin(int player, int cpu) {
    if (player==cpu) { 
      System.out.println("Tie!");
    } else if ((player == 0 && cpu == 2) || (player ==1 && cpu == 2|| (player ==2 && cpu ==1)) ) { 
      System.out.println("You win!");
    } else {
      System.out.println("The computer wins!");
    }
    System.out.println("-----");
  }

  private static boolean play(Scanner sc, Random r) {
    // Ask player for input
    int choice = playerMove(sc);

    // Quit if player wants to quit
    if (choice ==9) {
      return false;
    }

    // Computer randomly chooses a move
    int cpu=r.nextInt(3);

    System.out.println("You chose: " + MOVES[choice]);
    System.out.println("The computer chose: " + MOVES[cpu]);

    checkWin(choice, cpu);

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    boolean keepPlaying = true;

    System.out.println("Welcome to Rock Paper Scissors!");

    while (keepPlaying) {
      keepPlaying = play(sc, r);
    }

    System.out.println("Thanks for playing!");
    sc.close();
  }
}