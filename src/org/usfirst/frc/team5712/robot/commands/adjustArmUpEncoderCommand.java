package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class adjustArmUpEncoderCommand extends Command {
	
	boolean finished;
	
    public adjustArmUpEncoderCommand() {
        requires(Robot.shooterSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (Robot.shooterSubsystem.shooterEncoder.get() < 0) {
			Robot.shooterSubsystem.shooterLift.set(-.25);
		}
		else if (Robot.shooterSubsystem.shooterEncoder.get() > 0) {
			Robot.shooterSubsystem.shooterLift.set(0.25);
			finished = true;
		}
    }

    protected boolean isFinished() {
        return finished;
    }

    protected void end() {
    	Robot.shooterSubsystem.shooterLift.set(0);
    }

    protected void interrupted() {
    	System.out.println("Adjustment of Shooter Arm Up: Interrupted");
    	end();
    }
}
