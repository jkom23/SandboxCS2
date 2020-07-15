public class MethodsPractice{

  // ----- Conditionals -----
  // Write these methods in one line!
  // Don't touch one(), two(), or three()
  // Instead, write your answers in oneAns(), etc.

  public static boolean one(boolean A, boolean B){ 
    if (A){
      if (!B){
        return true;
      }else{
        return false;
      }
    }else{
      return false;
    }
  }


  /*
 A: true=> check !B
 A: false=>  return false
 !B" true => return true 
 !B: false => return false
  */
  public static boolean oneAns(boolean A, boolean B){
    return A && !B;

  }

  public static boolean two(int A){
    if (A >= 0){
      if (A <= 15){
        return true;
      }else{
        return false;
      }
    }else{
      return false;
    }
  }

  public static boolean twoAns(int A){
    return (A>=0) && (A<=15);
  }

  public static boolean three(int A, boolean B){
    if (B && A >= 3){
      return false;
    }else{
      return true;
    }
  }

  public static boolean threeAns(int A, Boolean B) {
    return !(B && A>=3);
  }

  // ----- Methods -----
  // Replace the placeholder returns with actual code.

  /**
   * Return the smallest number
   * @param    x, y, z : 3 numbers
   * @return  the smallest
   */
  public static int findSmallest(int x, int y, int z){
    if (x<y&&x<z){
      return x;
    }else if(y<x&&y<z){
      return y;
    }else{
      return z;
    }
    }
    
  

  /**
   * Return whether x+y is greater than z
   * @param   x, y, z: 3 numbers
   * @return  whether x+y > z
   */
  public static boolean isSumGreater(int x, int y, int z){
    return x+y>z;
  }

  /**
   * Return whether number is positive
   * @param n the number
   * @return  true if n is positive, false otherwise
   */
  public static boolean isPositive(int n){
    return n > 0;
  }

  /**
   * Return whether two numbers share the same last digit
   * @param   x, y  the two numbers
   * @return        whether x and y share same last digit
   */
  public static boolean shareDigit(int x, int y){
    return (x%10==y%10);
  }

  /**
   * Return sum of digits in a number
   * @param n the number
   * @return  sum of digits of n
   */
  public static int sumDigits(int n){
   
    int s = 0;
    while (n >= 1) {
        s += n % 10;
        n /= 10;
    }
    return s;
  }
    
  /**
   * Return whether year is a leap year
   * @param year  the year
   * @return      whether year is a leap year
   */
  public static boolean isLeapYear(int year){
    return (year%4==0);
  }

  /**
   * Convert a number in binary to decimal
   * 
   * @param b a binary number
   */
 public static int convertToDecimal(int b){

int s=0;//sum
int p= 1;//what digits i will be multiplied by
int d=b;

while (d >= 1){

s+=d%10*p;
//take digits and multiply by p, then add that to sum
d = (d/10);
//then take d and cut off last digits

p= (p*2);
//change value of p to increase the exponents
}

return s;
 }

  /**
   * Print all numbers from one to n that
   * are multiples of 3 or 5.
   * @param n number to end at
   */
  public static void print35(int n){

    int s= 1;
    while(s<n){
      if((s%3==0 )||(s%5==0)){
        System.out.println(s);
      }
      s++;
    }
  }
    



  public static void main(String[] args) {
    // Test your methods here!
    
    System.out.println(convertToDecimal(1010));
    
    
    
        
  }
}