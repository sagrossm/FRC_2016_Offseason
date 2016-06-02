package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class invertMotorsFalseCommand extends Command {
	
	
    public invertMotorsFalseCommand() {
    	requires(Robot.driveSubsystem);        
    }

    protected void initialize() {
    	Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
		Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
		Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
		Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
