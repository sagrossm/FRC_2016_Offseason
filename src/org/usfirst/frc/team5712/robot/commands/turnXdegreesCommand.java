package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *	@author Team 5712
 */
public class turnXdegreesCommand extends Command {

    public turnXdegreesCommand() {
    	requires(Robot.driveSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveSubsystem.turnXdegrees(Robot.driveSubsystem.degreesTurn);
    }

    protected boolean isFinished() {
        return Robot.driveSubsystem.angle < -(Robot.driveSubsystem.degreesTurn) && Robot.driveSubsystem.angle > (-(Robot.driveSubsystem.degreesTurn) - 3);
    }

    protected void end() {
    	Robot.driveSubsystem.leftFront.set(0);
		Robot.driveSubsystem.leftRear.set(0);
		Robot.driveSubsystem.rightFront.set(0);
		Robot.driveSubsystem.rightRear.set(0);
    }

    protected void interrupted() {
    	System.out.println("Turning to " + "X" + "degrees has been interrupted");
    	end();
    }
}
