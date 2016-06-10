package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class InvertMotorsFalse extends Command {
	
	
    public InvertMotorsFalse() {
    	requires(Robot.driveSubsystem);        
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveSubsystem.invertMotorsFalse();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    	System.out.println("Un-Inverting Interupted");
    }
}
