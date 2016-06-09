
package org.usfirst.frc.team5712.robot;

import org.usfirst.frc.team5712.robot.subsystems.*;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import org.usfirst.frc.team5712.robot.OI;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * 
 * @author Team 5712
 * 
 */

public class Robot extends IterativeRobot {

	public static boolean IS_COMPETITION_ROBOT;
	
	public static DriveSubsystem driveSubsystem = new DriveSubsystem();	
	public static ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
	public static SolenoidSubsystem solenoidSubsystem = new SolenoidSubsystem();
	
	public static OI oi;
	
	//DriveStick commands
    Command InvertMotorsFalse, InvertMotorsTrue;
    Command ShiftGear;
    Command SolenoidIn, SolenoidOut;
    Command TurnXdegrees;
    
    //shootStick commands
    CommandGroup Shoot;
    
    //Autonomous commands
    Command autonomousSelected;
    Command angleSelected;
    
    CommandGroup LowbarAutonomous, MoatAutonomous;
    
    //Autonomous Selector
    SendableChooser autoChooser, angleChooser;
    
    //Camera Variables
    public Image frame;
	public int sessionFront;
    
    public void robotInit() {
		oi = new OI();
		
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Lowbar", LowbarAutonomous);
		autoChooser.addObject("Moat", MoatAutonomous);
		SmartDashboard.putData("Autonomous Mode Chooser", autoChooser);
		
		angleChooser = new SendableChooser();
		angleChooser.addDefault("120", 120);
		angleChooser.addObject("150", 150);
		
		solenoidSubsystem.compressor.setClosedLoopControl(true);
		
		frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		sessionFront = NIVision.IMAQdxOpenCamera("cam3", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		NIVision.IMAQdxConfigureGrab(sessionFront);
		CameraServer.getInstance().setImage(frame);
		
		driveSubsystem.resetGyro();
		driveSubsystem.resetDriveEncoders();
		shooterSubsystem.resetShooterEncoder();
    }
	
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        System.out.println("Autonomous Selected: " + autoChooser.getSelected());
        
    	solenoidSubsystem.in();
        driveSubsystem.resetDriveEncoders();
        driveSubsystem.resetGyro();
        
        autonomousSelected = (Command) autoChooser.getSelected();
        autonomousSelected.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
        driveSubsystem.display();
        shooterSubsystem.display();
    }

    public void teleopInit() {
    	if (autonomousSelected != null) autonomousSelected.cancel();
    	
    	driveSubsystem.resetDriveEncoders();
    	driveSubsystem.resetGyro();	
    }

    public void teleopPeriodic() {
    	driveSubsystem.drive.arcadeDrive(oi.driveStick);
    	
    	driveSubsystem.display();
    	shooterSubsystem.display();

		driveSubsystem.degreesTurn = (double) autoChooser.getSelected();
    }
    
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}
