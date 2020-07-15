import java.util.Random;
import java.util.Scanner;
//imports libraries
public class Magic8{

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //makes objects of Random and Scanner
        System.out.println("Welcome to Zoltan's Fortune Reader");
        //greets the user
        System.out.println("What is your name?");
        //ask user for name
        
        String name = sc.nextLine();
        //takes user input as name
        System.out.println("Hello " + name);
        //says hello
        String[] ans = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes - definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."}; 
        //makes array with responses
        boolean gameRun = true;

        
        while (gameRun){
            //while the user wants to play, they ask a question and random response is made
            System.out.println(name + ", ask a question.");
            String question = sc.nextLine();
            boolean LikeAns= false;
            int randomIndex = r.nextInt(ans.length);
            String reply = ans[randomIndex];
            System.out.println(reply);
            
            while(!LikeAns){
            //while the user does not like their their answer
                System.out.println(name + ", do you like your answer?");
                System.out.println("Yes: y  No: n  Quit: q");
                String response = sc.nextLine();
                if (response.equals("y")){
                    LikeAns = true;
                }else if(response.equals("n")){
                    randomIndex = r.nextInt(ans.length);
                    reply = ans[randomIndex];
                    System.out.println(reply);
                    //if they dont like answer, give them new answer
                }else if(response.equals("q")){
                    gameRun = false;
                    LikeAns = true;
                    //quit game
                }else{
                    System.out.println("Please input y, n, or q");
                    //input validation
                }

            }
        }
        
        System.out.println("Thanks for playing at Zoltan's Fortune Reader. Come again soon!");
        //closing message
        sc.close();
        //closes scanner
    }

}
