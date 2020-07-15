public class Sunflower{
    public static void main(String[] args){
	    /*
	     * This program is supposed to imitate
	     * a sunflower growing, but nothing's
	     * happening! Can you help me debug
	     * this code so that this sunflower can grow?
	     */

	    boolean isPlanted = false;
	    int numSeeds = 50;
	    double lengthOfStalkInInches = 0;
	    boolean hasSprouted = false;
	    int numDays = 0;
	    int numPetals = 0;
	    double inchesOfWater = 0;
	    String color;

	    // I'm planting my sunflower seeds in soil.
	    hasSprouted = false;
	    if (isPlanted){
		System.out.println("I've already planted the seeds.");
	    }else{
		numSeeds -= 20;
		System.out.println("Planting my sunflower seeds now!");
	    System.out.println("I have " + numSeeds + " seeds left."); 
    }

	    // Let's make sure we keep watering the sunflower!
	    inchesOfWater += 0.5;
	    hasSprouted = false;
    numDays += 3;

	// Let's check if the seeds have sprouted yet.
	hasSprouted = inchesOfWater > 10 && numDays >= 7;
    if (hasSprouted){
	System.out.println("Yay! Sprouts!");
    }else{
	isPlanted = true;
	System.out.println("No sprouts yet. Let's keep watering and waiting.");
    }

    // Let's keep watering and waiting.
    numDays += 7;
    inchesOfWater = numDays * 1.3;
    hasSprouted = inchesOfWater > 10 && numDays >= 7;
    if (hasSprouted){
	System.out.println("Yay! Sprouts!");
    }else{
      System.out.println("Aw. Let's keep watering and waiting.");
    }

    // Let's check if the sunflowers are growing!
			   numDays += 20;
			   inchesOfWater = numDays * 1.3;
			   if (hasSprouted && numDays > 25 && inchesOfWater > 25.2){
			       System.out.println("I see something poking out of the soil!");
			       lengthOfStalkInInches = 0.5;
			       color = "green";
      System.out.println("The plant is " + color + " and "
			 + "the stalk is "
			 + lengthOfStalkInInches + " inches tall.");
			   }else{
			       System.out.println("Aw. Let's keep watering and waiting.");
			   }

	    // Let's keep watering and waiting.
	    numDays += 50;
	inchesOfWater = numDays * 1.3;
    lengthOfStalkInInches += numDays * 0.7;
	if (hasSprouted && lengthOfStalkInInches > 50){
	    numPetals = numDays * 2;
	    color = "yellow";
	    System.out.println("The sunflower is so pretty!");
	    System.out.println("There are " + numPetals + " petals "
			       + "and they're bright and " + color + ".");
	    System.out.println("The sunflower is "
			       + lengthOfStalkInInches + " inches tall.");
	}else{
	    System.out.println("Aw. Let's keep watering and waiting.");
	}
    }
}