package org.usfirst.frc.team5712.robot;

import org.usfirst.frc.team5712.robot.commands.*;
import org.usfirst.frc.team5712.robot.commands.groups.Shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * 
 * @author Team 5712
 *
 */
public class OI {
	
	//Joysticks
	public Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_JOYSTICK);
	public Joystick shootStick = new Joystick(RobotMap.SHOOTSTICK_JOYSTICK);

	//Buttons
	//driveStick Buttons (Driver 1):
	public Button shiftGear_DriveStickTrigger; //1
	
	public Button invertMotorsTrue_DriveStickButton; //3
	public Button invertMotorsFalse_DriveStickButton; //4
	
	public Button turnXdegrees_DriveStickButton; //6 
	
	public Button solenoidOut_DriveStickButton; //7
	public Button solenoidIn_DriveStickButton; //8
	
	public Button switchCam_DriveStickButton; //9
	
	//shootStick Buttons (Driver 2):
	public Button shoot_shootStickTrigger; //1
	public Button intake_shootStickButton; //2
	
	public Button switchCam_shootStickButton; //3 
	
	public Button adjustArmUpEncoder_shootStickButton; //5
	public Button adjustArmDownEncoder_shootStickButton; //6
	
	public Button solenoidOut_shootStickButton; //10
	public Button solenoidIn_shootStickButton; //11
	
	public OI() {
		
		//driveStick Button Commands
		shiftGear_DriveStickTrigger = new JoystickButton(driveStick, 1);
		shiftGear_DriveStickTrigger.whileHeld(new ShiftGear());
		
		invertMotorsTrue_DriveStickButton = new JoystickButton(driveStick, 3);
		invertMotorsTrue_DriveStickButton.whenPressed(new InvertMotorsTrue());
		invertMotorsFalse_DriveStickButton = new JoystickButton(driveStick, 4);
		invertMotorsFalse_DriveStickButton.whenPressed(new InvertMotorsFalse());
		
		turnXdegrees_DriveStickButton = new JoystickButton(driveStick, 5);
		turnXdegrees_DriveStickButton.whenPressed(new TurnXdegrees());
		
		solenoidOut_DriveStickButton = new JoystickButton(driveStick, 7);
		solenoidOut_DriveStickButton.whenPressed(new SolenoidOut());
		solenoidIn_DriveStickButton = new JoystickButton(driveStick, 8);
		solenoidIn_DriveStickButton.whenPressed(new SolenoidIn());
		
		//shootStick Button Commands
		shoot_shootStickTrigger = new JoystickButton(shootStick, 1);
		shoot_shootStickTrigger.whenPressed(new Shoot());
		
		intake_shootStickButton = new JoystickButton(shootStick, 2);
		intake_shootStickButton.whenPressed(new Intake());
		
		adjustArmUpEncoder_shootStickButton = new JoystickButton(shootStick, 5);
		adjustArmUpEncoder_shootStickButton.whenPressed(new AdjustArmUpEncoder());
		
		adjustArmDownEncoder_shootStickButton = new JoystickButton(shootStick, 6);
		adjustArmDownEncoder_shootStickButton.whenPressed(new AdjustArmDownEncoder());
		
		solenoidOut_shootStickButton = new JoystickButton(shootStick, 10);
		solenoidOut_shootStickButton.whenPressed(new SolenoidOut());
		
		solenoidIn_shootStickButton = new JoystickButton(shootStick, 11);
		solenoidOut_shootStickButton.whenPressed(new SolenoidIn());
		
	}
}



