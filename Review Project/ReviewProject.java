public class ReviewProject{
  /* --- Basic Java --- */

  /**
   * A person is tall enough for the ride if
   * they are at least 4.7 feet tall. Given a
   * height in feet, return whether the person
   * can get on the ride.
   */
  public static boolean checkHeight(double height){
    return height>=4.7;
  }

  /**
   * Given an int n: Return whether n is
   * a multiple of 5 or 12.
   */
  public static boolean div5or12(int n){
    return n%5==0||n%12==0;
  }

  /**
   * Given two ints a,b: return true if
   * they share the same last two digits.
   */
  public static boolean shareLast2Digits(int a, int b){
    return a%100==b%100;
  }

  /**
   * Given an int n: if n is between -100 and 100,
   * then return n multiplied by 100. Otherwise,
   * return n plus 100.
   */
  public static int distort(int n){
    if (n>-100&&n<100){
      return n*100;
    }else{
      return n+100;
    }
  }

  /**
   * Given two ints a,b: return true if
   * at least one of them is 9, or if
   * their sum is 9.
   * Return false otherwise.
   */
  public static boolean makes9(int a, int b){
    return (a==9||b==9)||(a+b==9);
  }

  /* --- Loops and Arrays --- */

  /**
   * Print all even numbers from 0 to n,
   * and then return how many even numbers were printed.
   */
  public static int countEvens(int n){
    int numPrint=0;
      for (int i = 0; i<=n; i+=2){
        System.out.println(i);
        numPrint++;
      }
        return numPrint;
  }

  /**
   * Return the factorial of a number n.
   */
  public static int factorial(int n){
    int total=1;

    for(int i = 2; i<=n; i++){
      total = total*i;
    }
return total;
  }

  /**
   * Someone has a list of all the jellybeans in a jar.
   * Return how many jellybeans there are of my favorite flavor.
   */
  public static int countJellybeans(String[] jellybeans, String favorite){
    int numfavorite = 0;

    for (int i=0; i<jellybeans.length; i++){
      if (jellybeans[i].equals(favorite)){
        numfavorite+=1;
      }
    }
    return numfavorite;
  }

  /**
   * Given two arrays nums1 and nums2,
   * return a new array containing their 0th elements.
   * ex: [1,2,3], [2,3,4] => [1,2]
   * ex: [35,12,1], [9, 5] => [35, 9]
   */
  public static int[] combine(int[] nums1, int[] nums2){
    int[] array3 = new int[2];
    array3[0]= nums1[0];
    array3[1]= nums2[0];
    return array3;
 

  }

  /**
   * Return the sum of all the numbers in an array,
   * but if any two numbers are the same, then
   * they don't count toward the sum.
   * ex: [1,2,3,4] => 10
   * ex: [2,2,2,2] => 0
   * ex: [1,2,2,4] => 5
   */
  public static int getUniqueSum(int[] nums){
    int sum = 0;
    int occur = 0; 
    
    for (int i = 0; i < nums.length; i++){
      occur=0;
      for (int n = 0; n < nums.length; n++){
        if (i != n&&nums[i]==nums[n]){
          occur++;
          }
        }if (occur==0){
          sum+=nums[i];
        }
      }
      return sum;
    }


 
  public static void printArray(int[] array){
    for (int i =0; i<array.length; i++){
      System.out.println(array[i]);
    }
  }

  
}