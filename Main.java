//Imports Robot class into Main
import myClasses.Robot;

public class Main {
    
    public static void main(String[] args) {
        // Calling and initializing the Robot class/objects
        Robot myRobot = new Robot("George", 100, 150);
        Robot myRobot2 = new Robot("Julius Clanker", 90, 45);
        Robot myRobot3 = new Robot();

        // Prints all methods available in the class
        // .listMethods() can be called without using an object
        Robot.listMethods();

        System.out.println();

        // Checking the status of the robot
        myRobot.status();
        myRobot2.status();
        myRobot3.status();

        System.out.println();

        //Changes the name of myRobot2 from "Julius Clanker" to "Julius Ceasar"
        myRobot2.changeName("Julius Ceasar");
        myRobot2.status();

        System.out.println();

        // moves myRobot1 30 units right
        System.out.println("Robot's new X coord is: " + myRobot.moveX("right", 30));
        myRobot.status();

        System.out.println();

        // moves myRobot3 50 units backward
        System.out.println("Robot's new Y coord is: " + myRobot3.moveY("backward", 50));
        myRobot3.status();
        
    }

}
