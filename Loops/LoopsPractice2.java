public class LoopsPractice2{
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
int s=0;
while(s<=n){
  System.out.println(s);
  s++;

}
}

  /**
   * Say "Hello" n times
   * @param n number of times
   */
public static void sayHelloN(int n){
int s=0;
  while (s<n){
System.out.println("Hello");
s++;
}

}
  /**
   * Count backward to 0 from n
   *
   * @param n number to start at
   */
public static void countBack(int n){

while(n>=0) {
System.out.println(n);
n--;
}
}
  /**
   * Say all odd numbers up to n
   * @param n number to end at
   */
  public static void printOddToN(int n){
    int s=1;
    while(s<=n){
      System.out.println(s);
      s+=2;
    }
  }
  /**
   * Keep incrementing x until
   * x=target, and print x at each step
   * @param x       A number
   * @param target  The target number
   */
  public static void incremToTarget(int x, int target){
    
    while(x<target){
      System.out.println(x);
      x++;
    }
  }

  public static void main(String[] args) {
    //Test your methods here!
    printToN(44);
    sayHelloN(4);
    countBack(43);
    printOddToN(12);
    incremToTarget(3, 32);
  }

}