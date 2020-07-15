import java.util.Scanner;
//This program is a RNA & DNA quiz for 9th Grade Biology Students
//It gives questions, collects answers, and ajusts the students score
//Then, it returns a grade and comment to the student at the end
public class RNAandDNAquiz {
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int score = 0;
    System.out.println("Begin Quiz");
    System.out.println("                  ");

//question 1
    System.out.println("Question #1");
    System.out.println("Which enzyme reads DNA and codes the RNA nucleotides");
    System.out.println("A: DNA polymerase \tB: RNA polymerase \tC: Helicase \tD: Nucliase");

    // Validate Input
    String ans = sc.nextLine();
    while (!(ans.equals("A") || ans.equals("B")
          || ans.equals("C") || ans.equals("D"))) {
      System.out.println("A: DNA polymerase \tB: RNA polymerase \tC: Helicase \tD: Nucliase");
      System.out.println("Please type one of the following: A|B|C|D");
      ans = sc.nextLine();
    }

    // React accordingly
    if (ans.equals("D")){
      System.out.println("Wrong");
    }else if (ans.equals("A")){
      System.out.println("Wrong");
    }else if (ans.equals("B")){
      System.out.println("Correct");
      score++;
    }else if (ans.equals("C")){
      System.out.println("Wrong");
    }
System.out.println("Question #2");
//question 2
System.out.println("Which enzyme unzips DNA");
    System.out.println("A: DNA polymerase \tB: Helicase \tC: Unzipase \tD: Removase");

    // Validate Input
    String ans2 = sc.nextLine();
    while (!(ans2.equals("A") || ans2.equals("B")
          || ans2.equals("C") || ans2.equals("D"))) {
      System.out.println("A: DNA polymerase \tB: Helicase \tC: Unzipase \tD: Removase");
      System.out.println("Please type one of the following: A|B|C|D");
      ans2 = sc.nextLine();
    }

    // React accordingly
    if (ans2.equals("D")){
      System.out.println("Wrong");
    }else if (ans2.equals("A")){
      System.out.println("Wrong");
    }else if (ans2.equals("B")){
      System.out.println("Correct");
      score++;
    }else if (ans2.equals("C")){
      System.out.println("Wrong");
    }
System.out.println("Question #3");
//question 3
System.out.println("What is the term for this stage in protein synthesis: DNA --> RNA");
    System.out.println("A: Open \tB: Close \tC: Transcription \tD: Translation");

    // Validate Input
    String ans3 = sc.nextLine();
    while (!(ans3.equals("A") || ans3.equals("B")
          || ans3.equals("C") || ans3.equals("D"))) {
      System.out.println("A: Open \tB: Close \tC: Transcription \tD: Translation");
      System.out.println("Please type one of the following: A|B|C|D");
      ans3 = sc.nextLine();
    }

    // React accordingly
    if (ans3.equals("D")){
      System.out.println("Wrong");
    }else if (ans3.equals("A")){
      System.out.println("Wrong");
    }else if (ans3.equals("B")){
      System.out.println("Wrong");
    }else if (ans3.equals("C")){
      System.out.println("Correct");
      score++;
    }
System.out.println("Question #4");
//question 4
System.out.println("What is the term for this stage in protein synthesis: RNA --> Protein");
    System.out.println("A: Translation \tB: RNAtion \tC: Proteination \tD: Validation");

    // Validate Input
    String ans4 = sc.nextLine();
    while (!(ans4.equals("A") || ans4.equals("B")
          || ans4.equals("C") || ans4.equals("D"))) {
      System.out.println("A: Done \tB: Translation \tC: Proteination \tD: Validation");
      System.out.println("Please type one of the following: A|B|C|D");
      ans4 = sc.nextLine();
    }

    // React accordingly
    if (ans4.equals("D")){
      System.out.println("Wrong");
    }else if (ans4.equals("A")){
      System.out.println("Correct");
      score++;
    }else if (ans4.equals("B")){
      System.out.println("Wrong");
    }else if (ans4.equals("C")){
      System.out.println("Wrong");
    }

    //question 5
System.out.println("Question #5");
System.out.println("What is NOT a type of RNA");
    System.out.println("A: tRNA \tB: rRNA \tC: mRNA \tD: xRNA");

    // Validate Input
    String ans5 = sc.nextLine();
    while (!(ans5.equals("A") || ans5.equals("B")
          || ans5.equals("C") || ans5.equals("D"))) {
      System.out.println("A: tRNA \tB: rRNA \tC: mRNA \tD: xRNA");
      System.out.println("Please type one of the following: A|B|C|D");
      ans5 = sc.nextLine();
    }

    // React accordingly
    if (ans5.equals("D")){
      System.out.println("Correct");
      score++;
    }else if (ans5.equals("A")){
      System.out.println("Wrong");
    }else if (ans5.equals("B")){
      System.out.println("Wrong");
    }else if (ans5.equals("C")){
      System.out.println("Wrong");
    }

    //end of quiz
System.out.println("            Quiz is finished          ");

//closes scanner
    sc.close();

    System.out.println("–––––––––––––––––––––––––––––––––");
    
    
//gives grade and (funny) feedback to students
    if (score==5){
      System.out.println("Great Job!");
      System.out.println("Your grade is 100%");
    }else if(score==4){
      System.out.println("Good");
      System.out.println("Your grade is 80%");
    }else if(score==3){
      System.out.println("Review the material");
      System.out.println("Your grade is 60%");
    }else if(score==2){
      System.out.println("Your grade is 40%");
        System.out.println("Speak with Dr. Komaroff ASAP");
  }else if(score==1) {
    System.out.println("Your grade is 20%");
      System.out.println("You are a noob at biology; you suck");
}else if(score==0) {
  System.out.println("Your grade is 0%");
    System.out.println("YOU ARE A FAILURE");
}

}
}