package myClasses;

// Example class "Robot"
// NOT functional on FTC bot and only for an example of a constructed class
public class Robot{

    // Private modifier allows variables to be accessed only in the Robot class
    // Cannot be called or modified in any other class
    private String name;
    private int x;
    private int y;

    // Constructors: initializes the instance of a class when called

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
        System.out.println("myRobot.getX()");
        System.out.println("myRobot.getY()");
        System.out.println("myRobot.moveX(direction, units)");
        System.out.println("myRobot.moveY(direction, units)");

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

    // returns int x position of a robot
    public int getX(){

        return this.x;

    }

    // returns int y position of a robot
    public int getY(){

        return this.y;

    }

    // Changes X position of a robot
    // returns X pos int
    public int moveX(String direction, int units){

        if (direction == "right" || direction == "Right"){
            this.x += units;
        }
        else if (direction == "left" || direction == "Left"){
            this.x -= units;
        }
        else{
            System.out.println("Not a valid direction.");
        }

        return this.x;
   }

   // Changes Y position of a robot
   // returns Y pos int
   public int moveY(String direction, int units){

        if (direction == "forward" || direction == "Forward"){
            this.y += units;
        }
        else if (direction == "back" || direction == "backward" || direction == "Back" || direction == "Backward"){
            this.y -= units;
        }
        else {
            System.out.println("Not a valid direction.");
        }

        return this.y;
   }

}
