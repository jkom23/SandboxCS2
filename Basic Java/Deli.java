public class Deli{
  public static void main(String[] args) {
    boolean isOpen = false;
    String dayOfWeek = "Thursday";
    String breakfast;
    String lunch;
    double priceOfChips = 2.50;
    double priceOfCoffee = 1.25;
    int numCustomers = 0;
    double moneyMadeToday = 0;

    isOpen = !dayOfWeek.equals("Wednesday");

    if (!isOpen){
      System.out.println("The deli is closed right now.");
    }else if (isOpen && dayOfWeek.equals("Wednesday")){
      System.out.println("The deli is closed on Wednesdays.");
    }else if (isOpen){
      System.out.println("The deli is open!");
    }

    if (numCustomers == 0){
      System.out.println("No one's here right now.");
    }else{
      System.out.println("Wonder what they're going to order!");
    }

    numCustomers += 2;
    moneyMadeToday += priceOfChips * 3;
    System.out.println("The customers bought 3 bags of chips, which cost $"
                      + priceOfChips * 3 + ".");
    moneyMadeToday += priceOfCoffee * 5;
    System.out.println("The customers also bought 5 cups of coffee, "
                      + "which cost $" + priceOfCoffee * 5 + ".");

  }
}