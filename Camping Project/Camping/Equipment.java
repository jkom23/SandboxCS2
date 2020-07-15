public class Equipment{

  /**
   * There's a chance it might rain! Let's see if we need to
   * bring a tarp. If we're sleeping in cabins, then we definitely
   * don't need the tarp. Otherwise, we'll bring the tarp if it will rain.
   * @param willRain      will it rain
   * @param sleepInCabin  are we sleeping in a cabin
   * @return              true if we have to bring a tarp
   */
  public static boolean checkTarp(boolean willRain, boolean sleepInCabin){

  }

  /**
   * We'll want to bring a folding table along. However, we have to make
   * sure that only one person brings a table, because two tables will be
   * too heavy to carry! We'll also be in trouble if no one brings a table.
   * @param bringA  did camper A bring a table
   * @param bringB  did camper B bring a table
   * @return        true if exactly one camper brings a table
   */
  public static boolean checkTable(boolean bringA, boolean bringB){

  }

  /**
   * Boots are rated from 0..10, with 10 being the most durable.
   * We want to make sure that both boots are good to go!
   * A boot is beyond repair if its rating is 3 or under.
   * Return true if we can bring these boots!
   * @param left  rating of left boot
   * @param right rating of right boot
   * @return      true if both boots are good
   */
  public static boolean checkBoots(int left, int right){

  }

  /**
   * The bear bag has to be up while we're sleeping.
   * We don't care if the area doesn't have bears, but
   * if there are bears around, then the bag better be up!
   * We will use 0..23 to represent the hour. We sleep
   * from 20..06. Return whether the bear bag should be up.
   * @param time        current time (0..23)
   * @param bearsAround whether there are bears in the area
   * @return    true if the bear bag should be up
   */
  public static boolean checkBearBag(int time, boolean bearsAround){

  }

  /**
   * Each sock is given an ID from 1..numSocks. We want to
   * see how many possible pairs there are. Announce the IDs of each
   * sock in the pair for all possible pairs, and then return
   * the total number of possible pairs. (1,2) and (2,1) are the same!
   * Ex: (1,2), (1,3)... (2,3), (2,4)... etc
   * @param numSocks  number of socks
   * @return          total number of possible pairs
   */
  public static int pairSocks(int numSocks){

  }

  /**
   * We need to make sure that we have enough flashlights.
   * There should be one flashlight for every 4 campers.
   * Each flashlight is labeled with an ID, starting at 1.
   * Announce each flashlight ID up to the number of flashlights we need.
   * Return the number of flashlights we need.
   * @param numCampers  the number of campers
   * @return            number of flashlights we need
   */
  public static int countFlashlights(int numCampers){

  }

  /**
   * We need to make sure that everyone has a tent to sleep in.
   * We have a number of big tents (fits 4 people) and
   * small tents (fits 1 person). Do we have enough tents so that
   * everyone fits and each tent is full?
   * @param numSmall    number of small tents
   * @param numBig      number of big tents
   * @param numCampers  number of campers to fit
   * @return  true if possible to fit all campers and each tent used is full
   */
  public static boolean checkTents(int numSmall, int numBig, int numCampers){

  }

  public static void main(String[] args) {
    // Test your methods here!
  }
}