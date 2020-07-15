public class Turkey{

double weight;
boolean isHungry;

public Turkey(){
  this.weight=10;
  this.isHungry=true;
}

public Turkey(int weight, boolean isHungry){
  this.weight=weight;
  this.isHungry=isHungry;
}

public String toString(){
  return "Turkey: "+weight+"lbs, "+isHungry;
}

public double getWeight(){
  return weight;
}
//if the turkey grew, the farmer would want to know how much it grew



public boolean getHungry(){
  return isHungry;
}
//the farmer would to know if the turkey is hungry, so it can be fed



public void setHungry(boolean isHungry) {
  this.isHungry = isHungry;
}
//if the turkey already ate, the farmer could mark that it was no longer hungry



public void setWeight(double weight) {
  this.weight = weight;
}
//if the turkey was given x amount of food, the farmer could note that the weight increased by x amount



public void eat(double amountOfFood){
  if (isHungry){
    this.weight+=amountOfFood;
    this.isHungry = false;
  }
}

public void exercise(){
  weight-=0.5;
  isHungry=true;
}
  public static void main(String[] args) {
    System.out.println("Testing default constructor - 10, true");
    Turkey a = new Turkey();
    System.out.println(a);

    System.out.println("Testing constructor - 22, false");
    Turkey b = new Turkey(22, false);
    System.out.println(b);

    System.out.println("b tries to eat 10.5 but not hungry.");
    b.eat(10.5);
    System.out.println(b);

    System.out.println("a eats 11.3, should weigh 21.3");
    a.eat(11.3);
    System.out.println(a);

    System.out.println("a tries to eat again, but not hungry.");
    a.eat(5.5);
    System.out.println(a);

    System.out.println("a exercises, should weigh 20.8");
    a.exercise();
    System.out.println(a);

    System.out.println("a eats 3.8, should weight 24.6");
    a.eat(3.8);
    System.out.println(a);
  }

}