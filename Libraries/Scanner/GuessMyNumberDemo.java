import java.util.Scanner;

public class GuessMyNumberDemo{
  public static void main(String[] args) {
    // Create a Scanner
    Scanner sc = new Scanner(System.in);
    int myNumber = 349;

    // Give instructions and take input
    System.out.println("Please guess a number:");
    int guess = sc.nextInt();

    // Input validation
    while(guess != myNumber){
      if (guess > myNumber){
        System.out.println("Nope! Try a lower number:");
      }else{
        System.out.println("Nope! Try a higher number:");
      }
      guess = sc.nextInt();
    }

    // When does the while loop end?

    // Close the Scanner after you're done taking input
    sc.close();

    System.out.println("You did it! My number was " + myNumber);
  }
}