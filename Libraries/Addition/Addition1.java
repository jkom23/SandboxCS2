import java.util.Random;
import java.util.Scanner;

public class Addition1{

private static boolean generateProblem(Random r, Scanner sc){
    int x = r.nextInt(101);
    int y = r.nextInt(101);
    System.out.println(x+" + "+y+" = ");
    int z = sc.nextInt();
    return x+y == z;
}
public static void main(String[] args) {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("Answer the following problems");

    boolean gameOver = false;
    int score = 0;

    while (!gameOver){
        if (generateProblem(r, sc)){
            score ++;
            System.out.println("Correct");
        }else{
            gameOver = true;
            System.out.println("Wrong");
        }
    }
System.out.println("Thanks for playing. You got " + score +" question(s) correct");
}
}