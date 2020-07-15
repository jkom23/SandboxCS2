public class Arrays{

public static void printArray(boolean[] nums){
    for (int i=0; i<nums.length; i++){
        System.out.println(nums[i]);
    }
}

    public static void main(String[] args){
 //syntactic sugar way   
boolean[] testBoolean = {false, false, false, false, false};
testBoolean[3] = true;
testBoolean[4] = true;

//standard method
boolean [] testBooolean = new boolean [5];

for (int i=0; i<testBooolean.length; i++){
    testBooolean[i]=false;
}

}
}