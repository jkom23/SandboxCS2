public class LoopsPractice{
  /*
   * Try to write these methods!
   * For extra practice, try to write them
   * with both for and while loops.
   */

  /**
   * Print all nunmbers up to n
   * @param n number to end at
   */
public static void printToN(int n){
  int x = 1;
  while(x<=n){
    System.out.println(x);
    x += 1; //x++;
  }
}

public static void printToNFor(int n){
  for(int x = 1; x <= n; x++){
    System.out.println(x);
  }
}  /**
   * Say "Hello" n times
   * @param n number of times
   */


   public static void sayHelloN(int n) {
    int x = 1;
    while(x<=n){
    System.out.println("Hello");
    x += 1;
  }
}

public static void sayHelloNFor(int n){
  for(int x = 1; x <= n; x++){
    System.out.println("Hello");
  }
} 
  /**
   * Count backward to 0 from n
   *
   * @param n number to start at
   */
 public static void countBackToN(int n) {
  for (int x=n; x >= 0; x -= 1) {   
      System.out.println(x);
    }
  }

  public static void countBackWhile(int n){
    int i = n;
    while (i >= 0) {
      System.out.println(n);
      i--;
    }
  }
  /**
   * Say all odd numbers up to n
   * @param n number to end at
   */
public static void oddToN(int n){
  int x = 1;
  while(x<=n){
    System.out.println(x);
    x += 2;
  }
}

public static void countOdds(int n){
  for (int i=1; i<= n; i+=2){
    System.out.println(i);
  }
}

  /**
   * Keep incrementing x until
   * x=target, and print x at each step
   * @param x       A number
   * @param target  The target number
   */

public static void incrementToTarget(int start, int target){
  for(int y = start; y<=target; y++){
  System.out.println(y);
  }
}

public static boolean checkEven(int x){
  return x%2==0;
}
  public static void main(String[] args) {
    //Test your methods here!
   
    
  
  checkEven(30);
  }

}