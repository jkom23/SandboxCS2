public class ConditionalWeather{
    public static void main(String[] args){
	/* You'll have to figure out what happens! */

	String weather;
	boolean haveUmbrella;
	boolean isPrepared;
	double inchesOfRain;
	int daysOfRain;
	int degreesF;
	
	daysOfRain = 1;
	inchesOfRain = 0.5;
	isPrepared = daysOfRain > 1 && false;
	haveUmbrella = inchesOfRain * daysOfRain > 1 || isPrepared;

	if (haveUmbrella || daysOfRain >= 1){
	    weather = "Risk of rain.";
	}else if (isPrepared){
	    weather = "No sign of any clouds.";
	}else{
	    weather = "Lots of cumulus congestus in the sky.";
	}

	System.out.println(weather);

	haveUmbrella = inchesOfRain > 1;
	isPrepared = haveUmbrella;

	degreesF = 95;
	daysOfRain += 20;
	inchesOfRain = daysOfRain * 0.3;
	
	if (inchesOfRain > 10){
	    weather = "Nowhere close to sunny.";
	}else if (inchesOfRain > 5 && degreesF <= 100){
	    weather = "Good thing I have an umbrella.";
	}else if (inchesOfRain > 1){
	    weather = "What'd I bring this umbrella for?";
	}else{
	    weather = "Nice and sunny. Perfect fall weather.";
	}

	System.out.println(weather);
	
	System.out.println("It will be raining for "
			   + daysOfRain 
			   + " days.");
	System.out.println("There will be a total of "
			   + inchesOfRain
			   + " inches of rain.");
	
	daysOfRain -= 2;
	degreesF -= 5;
	inchesOfRain = inchesOfRain * daysOfRain + 0.2;
	isPrepared = haveUmbrella;
    }
}
