package org.marswars.frisbee;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    public static final int leftMotor = 2;
    public static final int rightMotor = 1;
    public static final int pressureSwitchChannel = 8;
    public static final int compressorRelayChannel = 1;
    public static final int solenoid1Extend = 4;
    public static final int solenoid1Retract = 3;
    public static final int solenoid2Extend = 11;
    public static final int solenoid2Retract = 6;
    public static final int xboxControllerPort = 1;
    
}
