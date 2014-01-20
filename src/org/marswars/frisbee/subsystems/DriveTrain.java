package org.marswars.frisbee.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.marswars.frisbee.RobotMap;
import org.marswars.frisbee.commands.ControlDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final RobotDrive train = new RobotDrive(RobotMap.leftMotorPWM, RobotMap.rightMotorPWM);
    private final Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB);
    private final Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB);

    public DriveTrain() {
        leftEncoder.setDistancePerPulse(RobotMap.angularToLinear / RobotMap.pulsesPerRevolution);
        rightEncoder.setDistancePerPulse(RobotMap.angularToLinear / RobotMap.pulsesPerRevolution);
        start();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ControlDrive());
    }

    public void arcadeDrive(double Y, double X) {
        train.arcadeDrive(Y, X);
    }

    private void start() {
        leftEncoder.start();
        leftEncoder.start();
    }

    public void printDistance() {
        SmartDashboard.putDouble("Left Encoder:", leftEncoder.getDistance());
        SmartDashboard.putDouble("Right Encoder:", rightEncoder.getDistance());
    }

    public void reset() {
        leftEncoder.reset();
        rightEncoder.reset();
    }
}
