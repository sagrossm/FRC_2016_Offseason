package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SolenoidOut extends Command {

    public SolenoidOut() {
    	requires(Robot.solenoidSubsystem);
    	setTimeout(.5);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.solenoidSubsystem.out();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    	System.out.println("SolenoidOut: Interrupted");
    	end();
    }
}
