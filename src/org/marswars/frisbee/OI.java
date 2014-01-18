package org.marswars.frisbee;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.marswars.frisbee.commands.CompressorStop;
import org.marswars.frisbee.commands.Solenoid1Extend;
import org.marswars.frisbee.commands.Solenoid1Retract;
import org.marswars.frisbee.commands.Solenoid2Extend;
import org.marswars.frisbee.commands.Solenoid2Retract;
import org.marswars.frisbee.commands.SolenoidsExtend;
import org.marswars.frisbee.commands.SolenoidsRetract;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public XboxController xbox;

    public OI() {
        xbox = new XboxController(RobotMap.xboxControllerPort);
        new JoystickButton(xbox, XboxController.ButtonType.kA.value).whenPressed(new Solenoid1Extend());
        new JoystickButton(xbox, XboxController.ButtonType.kB.value).whenPressed(new Solenoid1Retract());
        new JoystickButton(xbox, XboxController.ButtonType.kX.value).whenPressed(new Solenoid2Extend());
        new JoystickButton(xbox, XboxController.ButtonType.kY.value).whenPressed(new Solenoid2Retract());
        new JoystickButton(xbox, XboxController.ButtonType.kL.value).whenPressed(new SolenoidsExtend());
        new JoystickButton(xbox, XboxController.ButtonType.kR.value).whenPressed(new SolenoidsRetract());
        new JoystickButton(xbox, XboxController.ButtonType.kBack.value).whenPressed(new CompressorStop());
    }
}
