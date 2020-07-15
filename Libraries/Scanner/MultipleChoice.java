import java.util.Scanner;

public class MultipleChoice {
  /*
   * This class is an example of a program that validates a multiple choice
   * question and reacts accordingly.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Which of the following is not an ant?");
    System.out.println("A: Fire \tB: Carpenter \tC: Bullet \tD: Wasp");

    // Validate Input
    String ans = sc.nextLine();
    while (!(ans.equals("A") || ans.equals("B")
          || ans.equals("C") || ans.equals("D"))) {
      System.out.println("A: Fire \tB: Carpenter \tC: Bullet \tD: Wasp");
      System.out.println("Please type one of the following: A|B|C|D");
      ans = sc.nextLine();
    }

    // React accordingly
    if (ans.equals("D")){
      System.out.println("Correct! A wasp is not an ant!");
    }else if (ans.equals("A")){
      System.out.println("Fire ants exist...");
    }else if (ans.equals("B")){
      System.out.println("Carpenter ants exist...");
    }else if (ans.equals("C")){
      System.out.println("Bullet ants exist...");
    }

    sc.close();
  }
}