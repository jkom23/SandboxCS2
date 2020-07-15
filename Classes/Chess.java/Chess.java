public class Chess{
    public static void main(String []args){
    System.out.println("Testing default constructor:");
    Knight a = new Knight();
    System.out.println(a);
        
    System.out.println("Testing constructor - 7,6");
    Knight b = new Knight(7,6);
    System.out.println(b);
        
        
    System.out.println("a tries to moves to 5,7");
    a.canMove(5,7);
    a.move(5,7);
    System.out.println(a);

    System.out.println("b tries to moves to 5,7");
    b.canMove(5,7);
    b.move(5,7);
    System.out.println(b);
   

    }
    }