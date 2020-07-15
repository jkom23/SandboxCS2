public class Food{

  /**
   * If we're going camping, we have to make s'mores!
   * Let's check to make sure that it's possible.
   * We need 2 crackers, 1 marshmallow, and 1 bar of chocolate
   * for each person, as well as the campfire to be lit.
   * @param numCampers      number of campers
   * @param numCrackers     number of crackers
   * @param numMarshmallows number of marshmallows
   * @param numChocolates   number of chocolates
   * @param isCampfireLit   checks campfire
   * @return  true if we can make s'mores
   */
  public static boolean canMakeSmores(
    int numCampers,
    int numCrackers,
    int numMarshmallows,
    int numChocolates,
    boolean isCampfireLit){
    if (numChocolates>=(1*numCampers)&&numMarshmallows>=(1*numCampers)&&numCrackers>=(2*numCampers)&&isCampfireLit==true){
      return true;
    }else{
      return false;
    }
 }

 //this method checks if the values of the paramaters is enough for us to make smore
 //then it returns true or false depending on the condition that we have enough supplies



  /**
   * We want our potatoes to be just right. They are rated
   * from 1-20, where 20 is the most cooked. When we compare two
   * potatoes, we want to take the more cooked one, but only if
   * it's rated between 13..18. Otherwise, it's overcooked and we
   * don't want it. Return the rating of the potato we want,
   * and 0 if we don't want any.
   * @param rating1 rating of first potato
   * @param rating2 rating of second potato
   * @return  rating of potato we take, 0 if no potato
   */
public static int checkPotatoes(int rating1, int rating2){
 if ((rating1<=12 && rating2>=19)||(rating2<=12&&rating1>=19)
 ||(rating1>=12&&rating2>=12)||(rating2>=12&&rating1>=12)||
 (rating1<=19&&rating2<=19)||(rating2<=19&&rating1<=19)){
 return 0;
 //if any of the ratings are below 13 or over 18, it returns 0
 }else if(rating1>rating2){
   return rating1;
 }else if(rating2>rating1){
return rating2;
 }else{
   return -1;
   //error message
 }
}

//this method disgards potatoes that are over or undercooked, 
//then it finds the most cooked from what is left after our first parameter
//and returns the most cooked potato


  /**
   * As a treat, we'll bring some bags of candy with us.
   * Two students get to say how much candy they want, and
   * we'll take the smaller number. However, if they both
   * say the same number, then we'll take the sum!
   * @param c1  first student reply
   * @param c2  second student reply
   * @return    how many bags of candy to bring
   */
public static int countCandy(int c1, int c2){

if (c1>c2){
  return c2;  
}else if(c2>c1){
  return c1;
}else if (c2==c1){
  return c2+c1;
  }else{
    return -1;
    //error message
  }
}

//this method checks which value is greater, and returns the smaller value,
//if the values are the same, it sums them together

  /**
   * We can never have too many marshmallows! Somehow, they
   * keep multiplying... We start with n marshmallows, but
   * they double in number t times! How many marshmallows
   * do we end up with?
   * @param n starting number of marshmallows
   * @param t number of times they double
   * @return  final number of marshmallows
   */

   
  public static double countMarshmallows(double n, double t){
  return n * (Math.pow(2, t));

  }
//this method takes the number of marshmallows and multiplies them by 2 to the power of t
//then it returns the result

  /**
   * We have some picky students who refuse to go camping
   * if they have to eat food that they really don't like.
   * However, if the planned food is "Surf and turf", then
   * the student has no choice and they have to come.
   * @param dislikedFood  the food the student doesn't like
   * @param plannedFood   the food that we are going to eat
   * @return    true if the student will come camping
   */
public static boolean willStudentCome(String dislikedFood, String plannedFood){
  
  if(plannedFood.equals("Surf and turf")&&dislikedFood.equals("Surf and turf")){
  return true;
  }else if(plannedFood.equals(dislikedFood)){
    return false;
  }else{
    return true;
  }
}
//return true if the food that we are bringing is = to surf and turf, 
//if not, the student will not come on the trip

  

  /**
   * We want our food to taste good. Our meals are rated from 1-10,
   * with 10 being the most delicious. If any meal is rated 8+,
   * then it is good enough to make up for the other meals, EXCEPT:
   * If any meal is rated 2 or below, then the food is unbearable.
   * Otherwise, the food is tolerable.
   * Use the following encoding for the return value:
   * 0: food is unbearable
   * 1: food is tolerable
   * 2: food is good
   * @param breakfastRating
   * @param lunchRating
   * @param dinnerRating
   * @return  0, 1, or 2 corresponding to description
   */
 
   public static int isFoodOk(
    int breakfastRating, int lunchRating, int dinnerRating){
if(breakfastRating>=8&&lunchRating>2&&dinnerRating>2){
  return 2;
  //food is good if returns 2
}else if(lunchRating>=8&&breakfastRating>2&&dinnerRating>2){
  return 2;
}else if(dinnerRating>=8&&breakfastRating>2&&lunchRating>2){
return 2;
}else if(dinnerRating>2&&dinnerRating<8&&lunchRating>2&&lunchRating<8&&breakfastRating>2&&breakfastRating<8){
return 1;
//food is fine if returns 1
}else{
  return 0;
  //food is bad, so it returns 0, because if not 1 or 2, then 0 will be returned
}
}
  /**
   * Let's make sure we have enough sandwiches for everyone.
   * Each sandwich is labeled with an ID starting from 1.
   * Every 9th sandwich is a little moldy and can't be eaten.
   * Announce the IDs of each sandwich we check, and let us know
   * if the sandwich is moldy by appending ":moldy!" to the ID.
   * Make sure everyone gets a non-moldy sandwich!
   * Return how many sandwiches we need to check before everyone
   * gets a sandwich.
   * @param numCampers  number of campers
   * @return            number of checked sandwiches
   */
public static int countSandwiches(int numCampers){
  int i = 0; //total # of sandwiches
  int c = 0; //# of moldy 
  while(i < numCampers){
    i++;
  if(i % 9 == 0){
    c++;
    System.out.println(i + ":moldy!");
  //prints moldy if sandwhich is moldy
  }else{
    System.out.println(i);       
    //prints our ID of sandwich
  }
}
  return i + c;
  //the count of how many sandwiches we need to check
}


  public static void main(String[] args){
//run methods here

//these methods are real tests
System.out.println(canMakeSmores(9, 180, 90, 90, true));
System.out.println(countCandy(10, 110));
System.out.println(checkPotatoes(14, 16));
System.out.println(countMarshmallows(3, 3));
System.out.println(willStudentCome("apples", "Surf and turf"));
System.out.println(countSandwiches(28));
System.out.println(isFoodOk(9,3,3));

//these are thorough tests for many different valid values
System.out.println(canMakeSmores(11112, 180, 90, 90, true));
System.out.println(countCandy(111111, 12992));
System.out.println(checkPotatoes(1, 1));
System.out.println(countMarshmallows(99, 60));
System.out.println(willStudentCome("Surf and turf", "Surf and turf"));
System.out.println(countSandwiches(1));
System.out.println(isFoodOk(9,9,9));
  }
}