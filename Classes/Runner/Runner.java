public class Runner{

   String first, last;
   double speed;

public Runner(String first, String last, double speed){
    this.first = first;
    this.last = last;
    this.speed = speed;
}

public String toString(){
    return first +" "+ last + " runs " + speed + " mph.";
}

public String getName(){
    return first + " "+ last;

}

public double getSpeed(){
    return speed;
}

public void setName(String first, String last){
    this.first=first;
    this.last=first;
}

public void setSpeed(double speed){
    this.speed=speed;
}

public void train(){
    speed+=0.1;
}

public boolean isFasterThan(Runner other){
return speed> other.getSpeed();
}

public double timeToRun(double distance){
    return distance/speed;
}
      public static void main(String[] args) {
        /* Test Time methods */
    Runner a= new Runner("Helen", "Bell", 55);

    System.out.println(a.getName());
    for (int i=0; i<20; i++){
        a.train();
    }

    System.out.println(a);

    Runner b= new Runner ("Bell", "Helen", 33);
    System.out.println(a.isFasterThan(b));
     


}
    }