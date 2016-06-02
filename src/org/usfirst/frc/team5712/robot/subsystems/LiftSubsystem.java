package org.usfirst.frc.team5712.robot.subsystems;

import org.usfirst.frc.team5712.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LiftSubsystem extends Subsystem {
    
	public VictorSP shooterLift;
    
	public Encoder liftEncoder;
	
    public LiftSubsystem(){
    	
    	shooterLift = new VictorSP(RobotMap.SHOOTER_LIFT_MOTOR);
    	liftEncoder = new Encoder(RobotMap.LIFT_ENCODER_A, RobotMap.LIFT_ENCODER_B, false,Encoder.EncodingType.k4X);
    }
    
    public void initDefaultCommand() {
    }
    
    public void display(){
    	SmartDashboard.putNumber("Lift Encoder", liftEncoder.get());
    	
    }
    public void resetLiftEncoder(){
    	liftEncoder.reset();
    }
}

