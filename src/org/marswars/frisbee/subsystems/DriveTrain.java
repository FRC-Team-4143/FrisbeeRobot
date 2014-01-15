package org.marswars.frisbee.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import org.marswars.frisbee.RobotMap;
import org.marswars.frisbee.commands.ControlDrive;

public class DriveTrain extends Subsystem {

    private RobotDrive drive = new RobotDrive(RobotMap.LeftMotor, RobotMap.RightMotor);

    public void initDefaultCommand() {
        setDefaultCommand(new ControlDrive());
    }

    public void ControllerDrive() {
    }

    public void arcadeDrive(double y, double x, boolean b) {
        drive.arcadeDrive(y, x, b);
    }
    
    public void brake(double y, double x, boolean b) {
        drive.arcadeDrive(0, 0, b);
    }
}
