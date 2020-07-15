import java.util.Scanner;

public class guessnum{

    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner sc = new Scanner(System.in);
        int num = 989;
        int guess = sc.nextInt();

        
//input validation
        while (guess!=num){
            if(guess>num){
            System.out.println("Wrong! Guess lower");
            }else{
                System.out.println("Wrong! Guess higher");

            }
            guess = sc.nextInt();
        }


        System.out.println("You got it! My number was " +num);

        sc.close();
    }
}