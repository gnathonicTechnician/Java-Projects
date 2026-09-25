// Introductory class

// Every java program must start with a class
// This class prints "Hello World"
public class TestHi {

    /*
     * We won't be using this method to program the robot
     * But it is useful to know the different parts of the method header
     * That is present in the main method (method that allows the method within the class to run)
     * 
     * Visibility Modifier (public/private): determines if classes outside the program can access
     * the method or variable
     * 
     * Static: ensures the method can be used without having to initialize the object
     * 
     * Return value (void, int, double, boolean): determines the data returned in the method
            * Void - method returns no value
            * int - method returns an integer value
            * double - method returns a decimal value
            * boolean - method returns true or false value
     * Parameter list (in the paraenthesis): holds a list of variables that a method can take when called
            * We do not need to know what "String[] arg" is but those are
            * Parameter lists usually looks like (int num, String name, double price, boolean state)
     */
    public static void main(String[] arg){
        System.out.println("Hello World!");
    }
}
