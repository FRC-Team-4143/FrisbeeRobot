package org.marswars.frisbee;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.marswars.frisbee.commands.Brake;
import org.marswars.frisbee.commands.CompressorStop;
import org.marswars.frisbee.commands.SolenoidsTest;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public XboxController xbox;

    public OI() {
        xbox = new XboxController(RobotMap.xboxControllerUSBPort);
        new JoystickButton(xbox, XboxController.ButtonType.kA.value).whenPressed(new SolenoidsTest());
        new JoystickButton(xbox, XboxController.ButtonType.kB.value).whileHeld(new CompressorStop());
        new JoystickButton(xbox, XboxController.ButtonType.kRTrigger.value).whileHeld(new Brake());
    }
}
