public class tester{

    /**
     * There's a chance it might rain! Let's see if we need to
     * bring a tarp. If we're sleeping in cabins, then we definitely
     * don't need the tarp. Otherwise, we'll bring the tarp if it will rain.
     * @param willRain      will it rain
     * @param sleepInCabin  are we sleeping in a cabin
     * @return              true if we have to bring a tarp
     */
    public static boolean checkTarp(boolean willRain, boolean sleepInCabin){
      boolean bringTarp = true;
      if (sleepInCabin){
        bringTarp = false;
      }else if (willRain){
        bringTarp = true;
      }return bringTarp;
  // This code uses if and else statements to distinguish whether or not you need to bring a tarp.
  // this method proves true if a tarp is needed and false if not. 
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
      boolean oneTable=true;
      if (bringA && bringB){
        oneTable = false;
      }if (!bringA && !bringB){
        oneTable = false;
      }if (bringA && !bringB){
        oneTable = true;
      }if (!bringA && !bringB){
        oneTable = true;
      }return oneTable;
      // This method returns true if only one person has brought a table but false if both or neither camper has brought a table.
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
    boolean checkBoots = true;
    if (left >= 3 && right >= 3){
      checkBoots = true;
    }else{
      checkBoots = false;
    }return checkBoots;
    // this method only emits true if both ratings are above a 3. 
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
      boolean checkBearBag = true;
    if (time > 6 && time < 20 && bearsAround){
      checkBearBag = false;
    }else{
      checkBearBag = true;
    }return checkBearBag;
    // this method returns false whenever the campers are awake. It returns true when the time
    // is when the campers are not awake.
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
      int numPairs=0;
      for (int i=0;i<numSocks;i++){
        for (int x=i;x<numSocks;x++){
          if (i!=x){
            numPairs++;
            System.out.println("("+i+","+x+")");
          }
        }
      }
      return numPairs;
      // this method uses loops to find all the possible pairs up to a certain number. It returns the ID's of
      // all the pairs and then the total number of possible pairs.
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
      int numFlashlights=0;
      for (int i=numCampers;i>=0;i=i-4){
        numFlashlights++;
        System.out.println(numFlashlights);
      }
      return numFlashlights;
      // this code returns the ID's of all the flashlights and the total number of flashlights needed. 
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
      return(numCampers==(4*numBig)+numSmall);
      //this code returns true if all the campers can fit into tents and all the tents are full.
    }
  
    public static void main(String[] args) {
      // Test your methods here!
      //these are my real tests
    System.out.println(checkTents(2, 4, 18));
    System.out.println(pairSocks(5));
    System.out.println(checkTarp(false, false));
    System.out.println(checkBoots(5,6));
    System.out.println(checkBearBag(17,true));
    System.out.println(countFlashlights(17));
    System.out.println(checkTable(true, true));
  
      
    }
  }