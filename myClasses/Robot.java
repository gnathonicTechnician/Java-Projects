package myClasses;

// Example class "Robot"
public class Robot{

    // Private modifier allows variables to be accessed only in the Robot class
    // Cannot be called or modified in any other class
    private String name;
    private int x;
    private int y;

    // Constructors: initializes the instance of a class when calles

    // Default constructor when no arguments are passed
    public Robot(){

        // Calls the constructor with default arguments
        this("Default", 0, 0);

    }

    // Robot constructor that takes arguments name, xStart, and yStart
    public Robot(String name, int xStart, int yStart){

        // Sets arguments to variables
        this.name = name;
        this.x = xStart;
        this.y = yStart;

    }

    // Static method that allows you to print out every method that can be called with an object
    // Key word Static: method that can be called without calling the instance of a class
    public static void listMethods(){

        System.out.println("Methods:");
        System.out.println("myRobot.changeName(name)");
        System.out.println("myRobot.status()");
        System.out.println("myRobot.moveRight(deltaX)");
        System.out.println("myRobot.moveLeft(deltaX)");
        System.out.println("myRobot.moveUp(deltaY)");
        System.out.println("myRobot.moveDown(deltaY)");

    }

    // Changes the name of the robot object
    // does not return anything (void)
    public void changeName(String name){

        this.name = name;

    }

    // Prints the status of the robot object
    // does not return anything (void)
    public void status(){

        System.out.println(this.name + " is at (" + this.x + ", " + this.y + ").");

    }

    // Adds to the x coordinate of the robot object
    // returns the new x coordinate (int)
    public int moveRight(int deltaX){

        this.x += deltaX;
        return x;

    }

    // Subtracts from the x coordinate of the robot object
    // returns the new x coordinate (int)
    public int moveLeft(int deltaX){

        this.x -= deltaX;
        return x;

    }

    // Adds from the y coordinate of the robot object
    // returns the new y coordinate (int)
    public int moveUp(int deltaY){

        this.y += deltaY;
        return y;

    }

    // Subtracts from the y coordinate of the robot object
    // returns the new y coordinate (int)
    public int moveDown(int deltaY){

        this.y -= deltaY;
        return y;

    }

}
