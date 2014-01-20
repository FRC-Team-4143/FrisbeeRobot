package org.marswars.frisbee;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static final int xboxControllerUSBPort = 1;
    public static final int leftMotorPWM = 1;
    public static final int rightMotorPWM = 2;
    public static final int leftEncoderA = 0;
    public static final int leftEncoderB = 0;
    public static final int rightEncoderA = 0;
    public static final int rightEncoderB = 0;
    public static final int pulsesPerRevolution = 0;
    public static final double angularToLinear = 0.0; //This is the circumference of the wheels
    public static final int pressureSwitchDIOChannel = 0;
    public static final int compressorRelayChannel = 0;
    public static final int solenoid1ExtendChannel = 0;
    public static final int solenoid1RetractChannel = 0;
    public static final int solenoid2ExtendChannel = 0;
    public static final int solenoid2RetractChannel = 0;

}
