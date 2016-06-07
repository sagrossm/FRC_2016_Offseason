package org.usfirst.frc.team5712.robot.commands.autonomous;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class lowerArmAutonomous extends Command {
	
    public lowerArmAutonomous() {
        requires(Robot.shooterSubsystem);
    }

    protected void initialize() {
    	Robot.shooterSubsystem.lowerArmAutonomous();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.shooterSubsystem.shooterEncoder.get() > 1400;
    }

    protected void end() {
    	Robot.shooterSubsystem.shooterLift.set(0);
    }

    protected void interrupted() {
    }
}
