public class Extras{

  /**
   * We need to take attendance! There will be n students,
   * and each student has a corresponding ID starting from 1.
   * Each student should announce (print) their ID number,
   * but there's a catch:
   * ID numbers skip all multiples of 13, since that's unlucky.
   * @param n number of students
   * @return  the final ID number that is announced
   */
  public static int takeAttendance(int n){

  }

  /**
   * Let's make sure that the chaperone doesn't walk too
   * far ahead during a hike. If the chaperone moves too far away,
   * then they will wait until the campers catch up. The chaperone
   * and the campers will take steps at the same time, but they
   * move at different speeds.
   * Print out where the campers and the chaperone are at each step
   * during a short hike that is n feet long.
   * Return how many times the chaperone has to wait.
   * @param chaperoneSpeed  how many feet per step the chaperone takes
   * @param camperSpeed     how many feet per step the campers take
   * @param gap             distance of "too far" in feet
   * @param n               distance of the hike in feet
   * @return                number of times chaperone has to wait
   */
  public static int trackHike(
      int chaperoneSpeed, int camperSpeed, int gap, int n){

  }

  /**
   * Two campers are racing! If both campers start at the same location,
   * how much more does the losing camper have to run when the winning
   * camper finishes the race?
   * @param speedA    speed of camper A
   * @param speedB    speed of camper B
   * @param distance  how far the race is
   * @return          distance for losing camper to run
   */
  public static int race(int speedA, int speedB, int distance){

  }

  /**
   * Let's make sure everyone has a sleeping bag!
   * Every sleeping bag is labeled with an ID, starting from 1.
   * However, every 4th and 7th sleeping bag is torn, so
   * we need to make sure we don't give those out.
   * Announce the ID of sleeping bag, and append ":torn!"
   * if the sleeping bag is torn.
   * Return how many sleeping bags we need to check before
   * every camper has a sleeping bag.
   * @param numCampers  number of campers
   * @return            number of sleeping bags to check
   */
  public static int countSleepingBags(int numCampers){

  }

  public static void main(String[] args) {
    // Test your code here!
  }
}