package org.marswars.frisbee;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static final int leftMotorPWM = 1;
    public static final int rightMotorPWM = 2;
    public static final int pressureSwitchDIOChannel = 1;
    public static final int compressorRelayChannel = 1;
    public static final int solenoid1ExtendRelayChannel = 2;
    public static final int solenoid1RetractRelayChannel = 3;
    public static final int solenoid2ExtendRelayChannel = 4;
    public static final int solenoid2RetractRelayChannel = 5;
    public static final int xboxControllerUSBPort = 1;

}
