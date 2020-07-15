public class Booleans{
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean c = false;
    boolean d = true;
    boolean e = true;
    int x = 5;
    int y = 103;
    double z = 25.1;

    if (a || b || c && !(d || a && e) && x > y || y - 80 < z){
      System.out.println("Hello!");
    }

    System.out.println(a && d && !(e || c && b) || x + z > y && (c || !b));

    System.out.println(x + x + x > y);

    System.out.println(x + y - z > y - z && a || (!b && !d || !a));

    System.out.println(a && !(b || !(a && !d)) || e && a && x + y > 100);
  }
}