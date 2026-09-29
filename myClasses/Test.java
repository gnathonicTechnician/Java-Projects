package org.firstinspires.ftc.teamcode.mechanisms;
// This is an example of how a TeleOp program will look with our robot

// loads software tools for programming the robot from Qualcomm Robot Core SDK
// Allows us to use build in methods and classes without building them
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// imported code from TestBench.java program
import org.firstinspires.ftc.teamcode.mechanisms.H_TouchSensor_TestBench;
import org.firstinspires.ftc.teamcode.mechanisms.I_DCMotor_TestBench;

@TeleOp //Makes sure the Control Hub knows this class is for a TeleOp program
    
/* OpMode is a built-in FTC Template that allows the program to communicate with the
 * Physical robot. This allows the program to run loops and handle the game controller
 */
public class I_DcMotor extends OpMode {
    // creates Touch Sensor Object
    H_TouchSensor_TestBench benchTouchSensor = new H_TouchSensor_TestBench();
    // Creates DC Motor Object
    I_DCMotor_TestBench benchMotor = new I_DCMotor_TestBench();
    
    @Override
    // When init is pressed on the Driver Hub, this code is passed
    // This initializes the motor on the hardware map
    public void init() {
        benchMotor.init(hardwareMap);
    }

    @Override
    // The built in loop function allows the program to repeat through the code endlessly until stop
    public void loop() {
        // variable to control motor speed using left joystick on controller
        double motorSpeed = gamepad1.left_stick_y;
        // sets Motor Speed to motorSpeed
        benchMotor.setMotorSpeed(motorSpeed);

        // if we were using a Touch Sensor we would probably use this code
        /*
        if(benchTouchSensor.getTouchSensorState()){
            benchMotor.setMotorSpeed(0.5);
        } else {
            benchMotor.setMotorSpeed(0);
        }
         */

        // sets the behavior of the robot at zero power based on gamepad input
        if(gamepad1.a){
            benchMotor.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b)
        {
            benchMotor.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        // displays motor revolutions on Driver Hub
        telemetry.addData("Motor Revs", benchMotor.getMotorRevs());
        telemetry.update();
    }
}
