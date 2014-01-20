/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.frisbee.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author GrayKS
 */
public class SolenoidsTest extends CommandBase {
    
    private boolean m_isFinished = false;

    public SolenoidsTest() {
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        pneumatics.solenoid1Extend();
        Timer.delay(1);
        pneumatics.solenoid2Extend();
        Timer.delay(1);
        pneumatics.solenoid1Retract();
        Timer.delay(1);
        pneumatics.solenoid2Retract();
        Timer.delay(1);
        pneumatics.solenoidsExtend();
        Timer.delay(1);
        pneumatics.solenoidsRetract();
        Timer.delay(1);
        pneumatics.solenoidsStop();
        m_isFinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return m_isFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
        m_isFinished = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        pneumatics.solenoidsStop();
    }
}
