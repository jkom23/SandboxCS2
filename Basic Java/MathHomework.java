public class MathHomework {
    public static double getAreaOfCircle(double r1){
        double areaCircle = 3.14 * (r1 * r1);
        System.out.println (areaCircle);
        return areaCircle;
	/** This takes the equation for the area of a circle, 
	 * pi times radius square. 
	 * and prints out the area
	 */
     
    }
   
    public static double getAreaOfTriangel(double b1, double h1){
        double areaTriangle = (b1 * h1)/2;
        System.out.println (areaTriangle);
        return areaTriangle;
        
	/** This takes the equation of a triangel, 
	 * base times hight divided by 2. 
	 * and prints out the area
	 */
    }
   
    public static double getAreaOfSquare(double l){
	double areaSquare = l * l;
	System.out.println (areaSquare);
	return areaSquare;
	/** this takes the formula for a square 
	 * lenghth times length because the lenghts are the same
	 * and times them together
	 * then its prints out the area
	 */
        
    }
   
    public static double getAreaOfRectangle(double b2, double h2){
	double areaRectangle = b2 * h2;
	System.out.println (areaRectangle);
	return areaRectangle;
	/** this takes the formula for rectangle area
	 * which is base times height
	 * and times them together
	 * then prints our the area
	 */
        }
   
    public static double getVolumeOfSphere(double r2){
	double volumeSphere = 1.33 * 3.14 * (r2 * r2 * r2);
	System.out.println (volumeSphere);
	return volumeSphere;
/** this takes the formula for the volume of a sphere,
	 * which is 4/3 times pi times the radius cubed,
	 * then it calculates the result and 
	 * prints out the volume
	 */
   
  
    }
   
    public static void main(String[] args) {
        getAreaOfCircle(2);
        getAreaOfTriangel(3, 4);
        getAreaOfSquare(5);
        getAreaOfRectangle(6, 7);
        getVolumeOfSphere(8);
        
	/** this is the final section where we call in all of the
	 * methods to preform calculations using the formulas
	 * and said values
	 */        
    }
}





