public class loops { 
    public static void countToMil(double n){
        double x = 1;
        while (x<n){
            System.out.println(x);
            x += 1;
        }
    }



public static void countToFor(int n){
    for (int x = 1; x < n; x += 1){
        System.out.println(x);
    }
}
    public static void main(String[] args){
        countToMil(1000000000);
        countToFor(69);
    }
    
}

