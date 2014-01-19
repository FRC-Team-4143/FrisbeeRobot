package org.marswars.frisbee.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import org.marswars.frisbee.RobotMap;
import org.marswars.frisbee.commands.ControlDrive;

public class DriveTrain extends Subsystem {

    private final RobotDrive drive = new RobotDrive(RobotMap.leftMotorPWM, RobotMap.rightMotorPWM);

    public void initDefaultCommand() {
        setDefaultCommand(new ControlDrive());
    }

    public void ControllerDrive() {
    }

    public void arcadeDrive(double Y, double X) {
        drive.arcadeDrive(Y, X);
    
    }
}
