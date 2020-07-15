import java.util.Random;
import java.util.Scanner;

public class RandomTable{
    public static void main(String[] args) {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    int numRoll =  0;
    int tableNum = 0;
    boolean wantToPlay = true;

    System.out.println("What table do you want to choose? Table 1, Table 2, or Table 3.");
    tableNum = sc.nextInt();
    if (tableNum==1){
        tableNum = 1;
    }else if(tableNum==2){
        tableNum=2;
    }else if(tableNum==3){
        tableNum=3;
    }else{
        System.out.println("Please enter: 1, 2, or 3");
    }

    System.out.println("How many times do you want to roll?");
    numRoll = sc.nextInt();

    if (numRoll>=1){
        numRoll = numRoll;
    }else{
        System.out.println("Please enter a valid number of rolls.");
    }
    
    String[] table1 = {"opal", "emerald", "ruby", "sapphire", "garnet", "quartz"};
    String[] table2 = {"Stumble to the ground", "Become super hungry", "All food becomes rotten", "Teleported to a dungeon", "See ghosts for two hours", "Lose sense of direction", "Lose sense of direction", "Lose all memory of past 24 hours", "Nothing happens"};
    String[] table3 = {"apples", "bananas", "grapes", "cherries", "oranges"};
    
    int randomIndex1 = r.nextInt(table1.length);
    String reply = table1[randomIndex1];
    int randomIndex2 = r.nextInt(table2.length);
    String reply2 = table2[randomIndex2];
    int randomIndex3 = r.nextInt(table3.length);
    String reply3 = table3[randomIndex3];
    
    while (wantToPlay){
        if (tableNum==1){
            for (int i =0; i>numRoll; i++){
                randomIndex1 = r.nextInt(table1.length);
                reply = table1[randomIndex1];
                System.out.println(reply);
            }
        }else if (tableNum==2){
            for (int i =0; i>numRoll; i++){
                randomIndex2 = r.nextInt(table2.length);
                reply2 = table2[randomIndex2];
                System.out.println(reply2);
            }
        }else{
            for (int i =0; i>numRoll; i++){
                randomIndex3 = r.nextInt(table3.length);
                reply3 = table3[randomIndex3];
                System.out.println(reply3);
        }
    }
    System.out.println("Do you want to play again? Yes: y, Quit:q");
    String quit = sc.nextLine();
    if (quit=="y"){
        wantToPlay = true;
    }else if (quit == "q"){
        wantToPlay = false;
    }else{
        System.out.println("Give a valid input, y or q");
    }
    }
}
}