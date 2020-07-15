public class rooktest{
    public static void main(String []args){
    System.out.println("Testing default constructor:");
    Rook a = new Rook();
    System.out.println(a);
        
    System.out.println("Testing constructor - 7,6");
    Rook b = new Rook(7,6);
    System.out.println(b);
        
    System.out.println("b moves to 2,6: ");
    b.canMove(2,6);
    b.move(2,6);
    System.out.println(b);
        
    System.out.println("b tries to move to 5,7");
    b.canMove(5,7);
    b.move(5,7);
    System.out.println(b);
        
    System.out.println("b moves to 5,6");
    b.canMove(5,6);
    b.move(5,6);
    System.out.println(b);
    }
    }