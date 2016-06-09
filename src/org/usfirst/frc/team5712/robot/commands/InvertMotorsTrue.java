package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class InvertMotorsTrue extends Command {

    public InvertMotorsTrue() {
    	 requires(Robot.driveSubsystem); 
    }

    protected void initialize() {
    	Robot.driveSubsystem.invertMotorsTrue();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    	System.out.println("Inverting Interupted");
    }
}
