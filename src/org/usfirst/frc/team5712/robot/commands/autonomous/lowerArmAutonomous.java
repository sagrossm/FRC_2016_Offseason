package org.usfirst.frc.team5712.robot.commands.autonomous;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class lowerArmAutonomous extends Command {
	
    public lowerArmAutonomous() {
        requires(Robot.shooterSubsystem);
        requires(Robot.liftSubsystem);
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
    	Robot.liftSubsystem.shooterLift.set(0);
    }

    protected void interrupted() {
    }
}
