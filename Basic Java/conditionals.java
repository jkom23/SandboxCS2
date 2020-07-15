public class conditionals{
    public static void main(String[] args){
	boolean isHungry;
	boolean haveEatenAlready;
	boolean isLunchTime;
	boolean amAlwaysHungry;
	double priceOfMeal = 99.99;
	String meal = "Chicken Parm";
	String favoriteMeal = "Roti";
	isLunchTime = false;
	amAlwaysHungry = true;
	haveEatenAlready = false;
	
	isHungry = haveEatenAlready && (isLunchTime || amAlwaysHungry);
	
	System.out.println(isHungry);
	if (isHungry){
	    System.out.println("I'm going to look for food.");
	}
	if (priceOfMeal >= 10){
	    System.out.println("Food is too expensive");
	}else{
	    System.out.println("Yay I can afford this.");
	}
	if (meal.equals("Chicken Parm")){
	    System.out.println("I guess I can eat this");
	}else if (meal.equals("Roti")){
	    System.out.println("Yum");
	}
    }
}