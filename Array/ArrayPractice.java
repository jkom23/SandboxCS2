public class ArrayPractice{
  /* Back to writing methods!
   * Replace the placeholder returns with real code.
   */

  /**
   * Here is an example of a written method!
   * What does this method do?
   */
  public static int countNine(int[] wobble){
    int count = 0;
    for (int idx = 0; idx < wobble.length; idx++){
      if (wobble[idx] == 9){
        count += 1;
      }
    }
    return count;
  }

  /**
   * I have a list of clients, but I don't know how
   * many I have in total. Can you tell me?
   * @param clients
   */
  public static int countClients(String[] clients){
    return clients.length;

  }

  /**
   * I have to do chores, but I'm given a choice between
   * two lists of tasks. I have a lot of free time so I
   * want to take the list that has more chores!
   * Return the list that has more chores.
   * @param choresA
   * @param choresB
   */
  public static String[] chooseMoreChores(String[] choresA, String[] choresB){
    if(choresA.length>choresB.length){
      return choresA;
    }else{
      return choresB;
    }
  }

  /**
   * I have limited edition shoes that I'm selling,
   * but I'm only going to sell it to the 3rd person in line.
   * Can you tell me the name of that person?
   * @param waitlist
   */
  public static String sellShoesTo(String[] waitlist){
    return waitlist[3];
  }

  /**
   * I have a list of the amount of snow that fell each day
   * in a given time span.
   * Can you tell me what the average snowfall is?
   * @param snowfalls
   */
  public static double getAverageSnowfall(double[] snowfalls){
    double sum =0;
    for (int i=0; i<snowfalls.length; i++){
      sum+=snowfalls[i];
    }
    return sum/snowfalls.length;
  }

  /**
   * I have a bunch of coins in my pocket!
   * Tell me how much they're worth in total.
   * @param coins
   */
  public static double countCoins(double[] coins){
    double sum =0;
    for (int i=0; i<coins.length; i++){
      sum+=coins[i];
    }
    return sum;
  }

  /**
   * My favorite number is 9. Can you tell me
   * how many times it appears?
   * @param nums
   */
  public static int count9(int[] nums){
    return -1;
    //write your own
  }

  /**
   * Count how many times my favorite song appears
   * in a playlist.
   * @param playlist  the list of songs
   * @param song      my fav song
   */
  public static int countFavoriteSong(String[] playlist, String song){
    int count=0;
    for(int i=0; i<playlist.length; i++){
      if (playlist[i].equals(song)){
        //.equals for a string
        count +=1;
      }
    }
    return count;
  }

  /**
   * My friend is throwing a holiday get-together, and
   * I'm in charge of the balloons. I bought some balloons,
   * but can you tell me if they correctly alternate between
   * red and blue? The first balloon should be red.
   * @param balloonColors  list of balloon colors
   */
  public static boolean doBalloonsAlternate(String[] balloonColors){
    return false;
  }

  public static void main(String[] args) {
    /* Test your code! */
    double[] snowfalls = {1,0,3,4,5,7};
    System.out.println(getAverageSnowfall(snowfalls));
  }
}