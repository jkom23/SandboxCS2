public class Classwork {
    /**
     * Write the following functions and test them with main()!
     */

    /**
     * Say hello three times.
     */

    public static void sayHello3() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    /**
     * Say hello to thise specified person.
     *
     * @param name The person
     */

    public static void sayHelloTo(String name) {

        System.out.println("Hello " + name);
    }

    /**
     * Square a number
     *
     * @param x The number
     * @return x squared
     */

    public static double square(double x) {
        double square = x * x;
        return x * x;

    }

    /**
     * Add one to a number
     *
     * @param x The number
     * @return x+1
     */
    public static int addOne(int x) {

        return x + 1;

    }

    /**
     * Return the bigger number
     *
     * @param x First number
     * @param y Second number
     * @return The bigger number
     */

    public static double returnBigNumber(double x, double y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    /**
     * Return the smaller number
     *
     * @param x First number
     * @param y Second number
     * @return The smaller number
     */
    public static double returnSmallNumber(double x, double y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    /**
     * Get the name of the day of the week
     *
     * @param x A number from 1-7
     * @return The name of the corresponding day of the week
     */
    public static String whatDay(int x) {
        if (x == 1) {
            return "Monday";
        } else if (x == 2) {
            return "tuesday";
        }
        // pretend goes till sunday
        else {
            return "Invalid: choose from 1-7";
        }
    }

    /**
     * Checks if a person can vote (over 18)
     *
     * @param age The age of the person
     * @return true if person can vote, false otherwise
     */
    public static boolean voteAge(int age) {
        return age >= 18;
    }

    /**
     * Find the average of three numbers.
     *
     * @param x First number
     * @param y Second number
     * @param z Third number
     * @return The average of x, y, and z
     */

    public static double averageOfNumbers(double y, double x, double z) {
        return (x + y + z) / 3.0;
    }

    /**
     * Did the person say yes?
     *
     * @param input The input String
     * @return /** Test to see if your functions work!
     */

    public static boolean answer(String input) {
        return input.equals("yes");
    }

    public static void main(String[] args) {
        sayHello3();
        sayHelloTo("bob");
        System.out.println(returnBigNumber(14, 92));
        System.out.println(returnSmallNumber(71, 12));
        System.out.println(square(5));
        System.out.println(addOne(92));
        System.out.println(voteAge(69));
        System.out.println(averageOfNumbers(3.1, 4.2, 5.3));
        System.out.println(answer("yes"));
        System.out.println(whatDay(2));

    }

}
