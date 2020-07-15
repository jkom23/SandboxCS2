public class Knight{
    private String type;
    private int x;
    private int y;
//basic properties of knight
    public Knight(){
         x=8;
         y=8;
        type = "Knight"; 
    }
    //creates knight with set location
    public Knight(int x, int y) {
        this.x=x;
        this.y=y;
        this.type= "Knight";
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
        return (abValue(this.x-x)==1)&&(abValue(this.y-y)==2)||(abValue(this.y-y)==1)&&(abValue(this.x-x)==1);        
    }
//because the change in x has to correspong with the change in y (either of them have to be 1, and the other 2,)
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
