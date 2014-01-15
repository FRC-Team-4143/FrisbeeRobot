package org.marswars.frisbee.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ControlDrive extends CommandBase {

    public ControlDrive() {
        requires(driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        SmartDashboard.putNumber("Y stick", oi.xbox.getY(GenericHID.Hand.kLeft));
        SmartDashboard.putNumber("X stick", oi.xbox.getX(GenericHID.Hand.kLeft));
        driveTrain.arcadeDrive(-1 * oi.xbox.getY(GenericHID.Hand.kLeft),-1 * oi.xbox.getX(GenericHID.Hand.kLeft), true);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
