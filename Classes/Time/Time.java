public class Time{

int hour, minute, second;

public Time(){
  hour=1;
  minute=11;
  second=11;
}

public Time(int hour, int min, int sec){
  this.hour=hour;
  this.minute=min;
  this.second=sec;
}

public String toString(){
  return hour +":"+minute+":"+second;
}

public int getHour(){
  return hour;
}

public int getMinute(){
  return minute;
}

public int getSecond(){
  return second;
}

public void setHour(int hour){
  this.hour= hour;
}

public void setMinute(int minute){
  this.minute= minute;
}

public void setSecond(int second){
  this.second= second;
}

public int getDifferenceFrom(Time other){
  return this.second - other.getSecond();
}

public boolean isEarlierThan(Time other){
  return getDifferenceFrom(other) > 0;
}

public boolean isLaterThan(Time other){
  return getDifferenceFrom(other) < 0;
}

  public static void main(String[] args) {
    /* Test Time methods */
    System.out.println("Testing default constructor - 1:11:11");
    Time a = new Time();
    System.out.println(a);

    System.out.println("Testing constructor - 23:23:23");
    Time b = new Time(23, 23, 23);
    System.out.println(b);

    System.out.println("Testing getters - 23:23:23");
    String bString = b.getHour() + ":" + b.getMinute() + ":" + b.getSecond();
    System.out.println(bString);

    System.out.println("Testing setters - 1:11:11 to 22:22:22");
    System.out.println(a);
    a.setHour(22);
    a.setMinute(22);
    a.setSecond(22);
    System.out.println(a);

    System.out.println("Testing comparisons");
    System.out.println("a should be -3661 from b");
    System.out.println("Difference between a & b: " + a.getDifferenceFrom(b));
    System.out.println("a is earlier than b: " + a.isEarlierThan(b));
    System.out.println("a is later than b: " + a.isLaterThan(b));

    Time c = new Time(11, 59, 18);
    System.out.println("b should be 41045 from c");
    System.out.println("Difference between b & c: " + b.getDifferenceFrom(c));
    System.out.println("b is earlier than c: " + b.isEarlierThan(c));
    System.out.println("b is later than c: " + b.isLaterThan(c));
//class files are descriptions
//fields=properties=state=instance variables
//properties of lions
//constructors-setting state of lion
//methods- behaivors of lions
//can declare variables ex. Lion a= new Lion()
//Lion a is variable of type lion, new Lion() is object of type lion
//String b= "text" 
// b is variable that holds object of type String
//object.method(param1, param2, ...)
//ex. "a.roar();"
//this. refers to whoever calls the method
//System.out.println();
//System.out is object
//println is method
  }
}