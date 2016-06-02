package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class intakeCommand extends Command {

    public intakeCommand() {
       requires(Robot.shooterSubsystem);
       setTimeout(1);
    }
    
    protected void initialize() {
    }

    protected void execute() {
		Robot.shooterSubsystem.shooterL.set(-.5);
		Robot.shooterSubsystem.shooterR.set(.5);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.shooterSubsystem.shooterL.set(0);
		Robot.shooterSubsystem.shooterR.set(0);
    }

    protected void interrupted() {
    	System.out.println("Intake Interrupted");
    	end();
    }
}
