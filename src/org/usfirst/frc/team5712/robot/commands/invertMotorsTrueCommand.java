package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class invertMotorsTrueCommand extends Command {

    public invertMotorsTrueCommand() {
    	 requires(Robot.driveSubsystem); 
    }

    protected void initialize() {
    	Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		Robot.driveSubsystem.drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
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
