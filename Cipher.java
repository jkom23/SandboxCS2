public class Cipher{
    public static char rot13(char c){
    if ((c>=65 && c <= 77)|| (c>= 97 && c<=109)){
        c+=13; 
    }else{
        c-=13;
    }
   
    return c;
    }
    
    public static char rotate (char c, int n){
        return c;
    }
    public static void main(String[] args) {
    System.out.println(rot13('U'));
    }
    
}