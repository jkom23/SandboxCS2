public class Review{

  /* Write a method that adds 2 to a number */
public static int add2 (int x){
  return x + 2;
}
  /* Write a method that doubles a number */
public static int doubleX(int x){
  return x*2;
}
  /* Write a method canVote() that prints "Yes!" and returns true
   * if age is at least 18
   */
public static boolean canVote(int age){
  if (age>=18){
    System.out.println("Yes!");
    return true;
  }else{
    return false;
  }
}
  /* Write a method that takes if it's rainy
   * and returns whether you need an umbrella.
   * You need an umbrella if it's rainy.
   */

public static boolean needUmbrella(boolean rainy){
  if (rainy){
    System.out.println("You need an umbrella!");
    return true;
    
  }else{
    return false;
  }
}



  /* Write a method that takes two ints (a,b) and
   * returns the smaller one, but if a = b, then
   * return their sum.
   */
public static int aOrB(int a, int b){
  if (a==b){
    return a+b;
  }else if (a>b){
    return b;
  }else if (b>a){
    return a;
  }else{
    return -1;
  }
}


  /* Clean up the following method. */
  public static int[] foo(int[] bar){
    int[] x = bar;
    if (x.length > 0){
      System.out.println(x[0]);
    }
    return bar;
  }

  /* Return true if exactly one of the parameters is true. */
  public static boolean xor(boolean A, boolean B){
    return A!=B;
  }

  /* Given 3 int values (a,b,c), return their sum.
   * However, if any values are the same, then they don't
   * count toward the sum.
   * ex: (1, 2, 3) => 6
   * ex: (3, 3, 2) => 2
   */

  public static int loneSum(int a, int b, int c){
    if (a==b&&b==c){
      return 0;
    }else if (a==b){
      return c;
    }else if (b==c){
      return a;
    }else if (a==c){
      return b;
    }else{
      return a+b+c;
    }
  }

  /* Write a method that prints all odd numbers from 1 to n. */
public static void oddToN(int n){
  for (int i =1; i<=n; i+=2){
    System.out.println(i);
  } 
}
  /* Write a method that prints every 5th number from 1 to n. */
  public static void fiveToN(int n){
    for (int i =1; i<=n; i+=5){
      System.out.println(i);
    } 
  }
  /* Write a method that prints out each element in a double array. */
public static void allArrayDouble(double[] array){
  for(int i=0; i<array.length; i++){
    System.out.println(array[i]);
  }
}
  /* Write a method that returns the sum of an int array. */
public static int sumOfArray(int[] array){
int sum=0;
for(int i=0; i<array.length; i++){
  sum+=array[i];
}
return sum;
}
  /* Write a method that returns the maximum element of an int array. */
  public static int maxOfArray(int[] array){
    int max=0;
    for(int i=0; i<array.length; i++){
      if (array[i]>max){
        max=array[i];
      }

    }
    return max;
    } 
  /* Write a method that returns the
   * most frequent element of an int array.
   */
  public static int[] freqArray (int[] array){
    
  }


  public static void main(String[] args) {
    // Test your methods here!
    int[] array= {1,3,5,69,69420}; 
    
    
    System.out.println(maxOfArray(array));
  }
}
