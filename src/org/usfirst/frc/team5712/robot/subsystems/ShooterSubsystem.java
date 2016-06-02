package org.usfirst.frc.team5712.robot.subsystems;

import org.usfirst.frc.team5712.robot.Robot;
import org.usfirst.frc.team5712.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ShooterSubsystem extends Subsystem {
    
	public VictorSP shooterL, shooterR;
	
	public Encoder shooterEncoder;
	
	public Servo servo;
	
	public DoubleSolenoid doubleSolenoid1, shooter;
	
	public Compressor compressor;
	
    public ShooterSubsystem(){
    	
    	shooterR = new VictorSP(RobotMap.SHOOTER_RIGHT_MOTOR);
    	shooterL = new VictorSP(RobotMap.SHOOTER_LEFT_MOTOR);
    	
    	shooterEncoder = new Encoder(RobotMap.SHOOTER_ENCODER_A, RobotMap.SHOOTER_ENCODER_B, false, Encoder.EncodingType.k4X);
    	
    	servo = new Servo(7);
    	
		doubleSolenoid1 = new DoubleSolenoid(RobotMap.SHIFTER_SOLENOID_A, RobotMap.SHIFTER_SOLENOID_B);
		shooter = new DoubleSolenoid(RobotMap.SHOOTER_SOLENOID_A, RobotMap.SHOOTER_SOLENOID_B);
		
		compressor = new Compressor(RobotMap.COMPRESSOR);
    	
    }
      
	protected void initDefaultCommand() {		
	}
	
    public void display(){
    	SmartDashboard.putNumber("Left Shooter Output", shooterL.get());
    	SmartDashboard.putNumber("Right Shooter Output", shooterR.get());
    	
    	SmartDashboard.putNumber("Shooter Encoder", shooterEncoder.get());
    	
    	SmartDashboard.putNumber("Servo Angle", servo.getAngle());
    }
    
    public void resetShooterEncoder(){
    	shooterEncoder.reset();
    }
    
    public void shoot(){
		shooterL.set(.5); //set left shooting motor to 1
		shooterR.set(-.5); //set right shooting motor to inverse of left shooting motor
		Timer.delay(.25);
		shooter.set(DoubleSolenoid.Value.kForward); //pushes the ball into the motors to shoot
		Timer.delay(.5);
		shooterL.set(0); //stops the left shooting motor
		shooterR.set(0); //stops the right shooting motor
		shooter.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void lowerArmAutonomous(){
    	if(shooterEncoder.get() < 140){
    		Robot.liftSubsystem.shooterLift.set(-0.25);
    	}
    }
}

