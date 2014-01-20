package org.marswars.frisbee.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.marswars.frisbee.OI;
import org.marswars.frisbee.subsystems.DriveTrain;
import org.marswars.frisbee.subsystems.Pneumatics;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    public static Pneumatics pneumatics = new Pneumatics();              
    public static void init() {
        
        oi = new OI();

        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(pneumatics);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
