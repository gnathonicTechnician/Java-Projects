import myClasses.Robot;

public class Main {
    
    public static void main(String[] args) {
        Robot myRobot = new Robot("George", 100, 150);
        Robot myRobot2 = new Robot("Julius Clanker", 90, 45);
        Robot myRobot3 = new Robot();

        myRobot.status();
        myRobot2.status();
        myRobot3.status();
    }

}
