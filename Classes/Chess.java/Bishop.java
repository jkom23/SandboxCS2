public class Bishop{
    private String type;
    private int x;
    private int y;
//basic properties of knight
    public Bishop(){
         x=8;
         y=8; 
        type = "Bishop"; 
    }
 //creates knight with set location
    public Bishop(int x, int y) {
        this.x=x;
        this.y=y;
        this.type= "Bishop";
    }
//allows knight to be made with custom location on board
    public String getType(){
        return type;
    }
//gets what piece it is (knight) because type is private
//ex. if a novice player didn't know what a knight was
    public int getPositionX(){
        return x;

    }
//gets the x coordinate because x is a private variable
    public int getPositionY(){
        return y;
    }

//gets the y coordinate because y is a private variable
    public String toString(){
        return type+": "+x+","+y;
    }
//shows what type is the piece, and where it is located
    public int abValue(int n){
        if (n<0){
            n=-n;
        }
        return n;
        }
     //finds the absolute value of a number,
    public boolean canMove(int x, int y){
        return abValue(this.x-x)==abValue(this.y-y);        
    }
//if the change in x = change in y, the bishop can move, because if you go up 2 and side 2, you move in a diagonal
    public boolean move(int x, int y){
        if (canMove(x,y)){
            this.x=x;
            this.y=y;
            return true;
        }else{
            return false;
        }
//if the piece can move, change the position to that location, and move the piece
    }
}




