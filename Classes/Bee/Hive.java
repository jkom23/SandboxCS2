public class Hive{
    public static void main(String[] args){
        System.out.println(Bee.numBees);
        Bee a = new Bee();
        System.out.println(Bee.numBees);
        Bee b= new Bee();
        System.out.println(a.numBees);
        System.out.println(b.numBees);
        System.out.println(Bee.numBees);
   }
}