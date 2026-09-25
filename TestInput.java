// Importing the Scanner Class
// Scanner is a built in class provided by Java
import java.util.Scanner; 

public class TestInput {
    public static void main(String[] args){

        // initializing an instance of the scanner class
        // "input" is the name of the object
        Scanner input = new Scanner(System.in);

        // Stores a String input into variable "name"
        // .nextLine() is a method within the Scanner class
        String name = input.nextLine();

        // Prints out "Hi" concatinated with the name inputted
        System.out.println("Hi " + name);

        //Closes the scanner
        //.close() is also a method in the Scanner class
        input.close();
    }
}
