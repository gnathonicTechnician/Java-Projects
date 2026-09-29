package org.firstinspires.ftc.teamcode.mechanisms;

// loads software tools for programming the robot from Qualcomm Robot Core SDK
// Allows us to use build in methods and classes without building them
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

// Class to test a DC Motor
public class I_DCMotor_TestBench {
    // Defines DCMotor object and ticksPerRev Variable
    private DcMotor motor;
    private double ticksPerRev;

    // Initializes the motor on the hardware map
    public void init(HardwareMap hwMap){
        // This line connects the code to the physical motor through the Drive Hub's hardware map
        motor = hwMap.get(DcMotor.class, "motor");

        // Sets speed regulation of the motor
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // sets ticksPerRev on actual Ticks Per Rev based on motor type
        ticksPerRev = motor.getMotorType().getTicksPerRev();

        // sets brake
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // flips direction if motor is mounted backwards on robot
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    // When called, motor speed/power is assigned based on argument given
    public void setMotorSpeed(double speed){
        motor.setPower(speed);
    }

    // returns the current position of the motor divided by the ticksPerRev
    public double getMotorRevs(){
        return motor.getCurrentPosition() / ticksPerRev;
    }

    // Locks motor when power is at zero
    // Prevents it from moving
    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroBehavior){
        motor.setZeroPowerBehavior(zeroBehavior);
    }
}
