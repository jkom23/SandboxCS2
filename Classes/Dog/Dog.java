public class Dog{

    // Instance variables 
String furType;
String breed;
String furColor;
double weight;
String name;

//Constructor
public Dog(String n, String b){
    breed = b;
    weight = 12.5;
    name = n;
  }

  public void bark(){
      System.out.println(name);
      System.out.println("Hey by the way I'm a " + breed);
  }




}