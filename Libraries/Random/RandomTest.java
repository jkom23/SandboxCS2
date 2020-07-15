import java.util.Random;

public class RandomTest{
    public static void main(String[] args) {
        Random r = new Random(); 
        
        String[] answers = {"Yes", "No", "Maybe"};

        int randomIndex = r.nextInt(answers.length);
        
        String bar = answers[randomIndex];
        
        

        System.out.println(bar);

    }
}