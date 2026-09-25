//Imports Robot class into Main
import myClasses.Robot;

public class Main {
    
    public static void main(String[] args) {
        // Calling and initializing the Robot class/objects
        Robot myRobot = new Robot("George", 100, 150);
        Robot myRobot2 = new Robot("Julius Clanker", 90, 45);
        Robot myRobot3 = new Robot();

        // Checking the status of the robot
        myRobot.status();
        myRobot2.status();
        myRobot3.status();
    }

}
