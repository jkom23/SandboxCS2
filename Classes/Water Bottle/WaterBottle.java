public class WaterBottle{

int current, capacity;

public WaterBottle(){
  current=0;
  capacity=32;
}

public WaterBottle(int current, int capacity){
  this.current = current;
  this.capacity = capacity;
}

  public String toString(){
    return "WaterBottle: " + current + "/" + capacity;
  }


  public int getCurrent(){
    return current;
  }

  public int getCapacity(){
    return capacity;
  }

  public void setCurrent(int current){
    this.current= current;
  }

  public void fill(){
    setCurrent(capacity);

  }

  public void empty(){
    setCurrent(0);
  }

  public int getDifferenceFrom(WaterBottle other){
      return this.current - other.getCurrent();
  }

  public boolean hasLessWaterThan(WaterBottle other){
    return getDifferenceFrom(other) < 0;
  }
  public static void main(String[] args) {
    System.out.println("Testing default constructor:");
    WaterBottle a = new WaterBottle();
    System.out.println(a);

    System.out.println("Testing constructor: 18/64");
    WaterBottle b = new WaterBottle(18, 64);
    System.out.println(b);

    System.out.println("Testing getters and setters:");
    System.out.println("a: " + a.getCurrent() + "/" + a.getCapacity());
    System.out.println("Setting a to 11");
    a.setCurrent(11);
    System.out.println(a);

    System.out.println("Filling and emptying a:");
    a.fill();
    System.out.println(a);
    a.empty();
    System.out.println(a);

    System.out.println("Testing comparisons:");
    System.out.println("a should be -18 from b");
    System.out.println("Difference between a from b: " + a.getDifferenceFrom(b));
    System.out.println("a has less water than b: " + a.hasLessWaterThan(b));
  }
}