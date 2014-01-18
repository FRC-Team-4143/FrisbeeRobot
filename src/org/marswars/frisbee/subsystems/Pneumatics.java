/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marswars.frisbee.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.marswars.frisbee.RobotMap;

/**
 *
 * @author GrayKS
 */
public class Pneumatics extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final DoubleSolenoid solenoid1 = new DoubleSolenoid(RobotMap.solenoid1Extend, RobotMap.solenoid1Retract);
    private final DoubleSolenoid solenoid2 = new DoubleSolenoid(RobotMap.solenoid2Extend, RobotMap.solenoid2Retract);
    private final Compressor compressor = new Compressor(RobotMap.pressureSwitchChannel, RobotMap.compressorRelayChannel);

    public Pneumatics() {
        compressor.start();
    }

    public void initDefaultCommand() {
    }

    public void solenoid1Extend() {
        solenoid1.set(DoubleSolenoid.Value.kForward);
    }

    public void solenoid1Retract() {
        solenoid1.set(DoubleSolenoid.Value.kReverse);
    }

    public void solenoid2Extend() {
        solenoid2.set(DoubleSolenoid.Value.kForward);
    }

    public void solenoid2Retract() {
        solenoid2.set(DoubleSolenoid.Value.kReverse);
    }

    public void solenoidsExtend() {
        solenoid1.set(DoubleSolenoid.Value.kForward);
        solenoid2.set(DoubleSolenoid.Value.kForward);
    }

    public void solenoidsRetract() {
        solenoid1.set(DoubleSolenoid.Value.kReverse);
        solenoid2.set(DoubleSolenoid.Value.kReverse);
    }

    public void solenoidStop() {
        solenoid1.set(DoubleSolenoid.Value.kOff);
        solenoid2.set(DoubleSolenoid.Value.kOff);
    }

    public void compressorStop() {
        compressor.stop();
    }
}
