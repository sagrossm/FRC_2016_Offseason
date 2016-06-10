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
	public Button shiftGear_DriveStickTrigger = new JoystickButton(driveStick, 1);
	
	public Button invertMotorsTrue_DriveStickButton = new JoystickButton(driveStick, 3);
	public Button invertMotorsFalse_DriveStickButton = new JoystickButton(driveStick, 4);
	
	public Button turnXdegrees_DriveStickButton = new JoystickButton(driveStick, 6); 
	
	public Button solenoidOut_DriveStickButton = new JoystickButton(driveStick, 7);
	public Button solenoidIn_DriveStickButton = new JoystickButton(driveStick, 8);
	
	//shootStick Buttons (Driver 2):
	public Button shoot_shootStickTrigger = new JoystickButton(shootStick, 1);
	public Button intake_shootStickButton = new JoystickButton(shootStick, 2);
	
	public Button adjustArmUpEncoder_shootStickButton = new JoystickButton(shootStick, 5);
	public Button adjustArmDownEncoder_shootStickButton = new JoystickButton(shootStick, 6);
	
	public Button solenoidOut_shootStickButton = new JoystickButton(shootStick, 10);
	public Button solenoidIn_shootStickButton = new JoystickButton(shootStick, 11);
	
	public OI() {
		
		//driveStick Button Commands
		shiftGear_DriveStickTrigger.whileHeld(new ShiftGear()); //1
		

		invertMotorsTrue_DriveStickButton.whenPressed(new InvertMotorsTrue()); //3
		invertMotorsFalse_DriveStickButton.whenPressed(new InvertMotorsFalse()); //4
		
		turnXdegrees_DriveStickButton.whenPressed(new TurnXdegrees()); //6
		
		solenoidOut_DriveStickButton.whenPressed(new SolenoidOut()); //7
		solenoidIn_DriveStickButton.whenPressed(new SolenoidIn()); //8
		
		//shootStick Button Commands
		shoot_shootStickTrigger.whenPressed(new Shoot()); //1
		intake_shootStickButton.whenPressed(new Intake()); //2
		
		adjustArmUpEncoder_shootStickButton.whenPressed(new AdjustArmUpEncoder()); //5
		adjustArmDownEncoder_shootStickButton.whenPressed(new AdjustArmDownEncoder()); //6
		
		solenoidOut_shootStickButton.whenPressed(new SolenoidOut()); //10
		solenoidOut_shootStickButton.whenPressed(new SolenoidIn()); //11
		
	}
}