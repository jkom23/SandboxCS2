import java.util.Scanner;

public class password{
    public static void main(String[] args){
        //give instructions
        System.out.println("Please enter the password:");

        Scanner sc = new Scanner(System.in);
        String password = "opensesamex3";

        String guess = sc.nextLine();

        while (!guess.equals(password)){
            System.out.println("Wrong! Try again:");
            guess = sc.nextLine();
        }

        System.out.println("You got it!");

        sc.close();
    }
}