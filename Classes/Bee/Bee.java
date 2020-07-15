public class Bee{
    public static int numBees = 0;
    private int energy;
    private int honey;
    private int carryLimit;
    private int distanceFlown;


    public Bee(){
        this.energy = 0;
        this.honey = 0;
        this.carryLimit = 10;
        this.distanceFlown = 0;
        numBees ++;
    }

    public Bee(int carryLimit){
        this();
        this.carryLimit = carryLimit;
    }

    private boolean validateHoney(int honey) {
        return 0 <= honey && honey <= carryLimit;
    }


    public int getEnergy(){
        return energy;
    }

    public int getHoney(){
        return honey;
    }

    public int getDistanceFlowe(){
        return distanceFlown;
    }

    
    
    public boolean collect(int amtHoney){
      int newAmt= this.honey + amtHoney;
      if (validateHoney(newAmt)){
        this.honey= newAmt;
        return true;
      }else{
        return false;
      }
    }

    public boolean eat (int amtHoney){
            int newAmt = honey - amtHoney;
            if (validateHoney(newAmt)){
                honey = newAmt;
                energy += amtHoney;
                return true;
            }
            return false;
        }
    
  

  public boolean fly(int distance){

    if (energy>=distance){
        energy -= distance;
        distanceFlown+= distance;
        return true;
    }
    return false;
  }

  public static void main(String[] args){
      //test
  }
}

