public class LoopsReference{
  /* This is a reference file for loops! */

  /**
   * Count to the specified number
   * @param n the number
   */
  public static void countTo(int n){
    int i = 0;
    while (i <= n){
      System.out.println(i);
      i += 1;
    }
  }

  /**
   * Count to the specified number
   * using a _for_ loop
   * @param n the number
   */
  public static void countFor(int n){
    // i++ is equivalent to i+=1
    for (int i = 0; i <= n; i++){
      System.out.println(i);
    }
  }

  /**
   * Fake-checks my emails
   * and prints them using a while loop
   */
  public static void checkEmail(){
    int numUnreadEmails = 5;
    boolean haveEmails = true;
    while (haveEmails){
      System.out.println("I'm checking email #"+numUnreadEmails);
      numUnreadEmails -= 1;
      haveEmails = numUnreadEmails > 0;
    }
  }

  public static void main(String[] args){
    // Test my loops here
    // These should count to 25
    countTo(25);
    countFor(25);

    checkEmail();
  }

}