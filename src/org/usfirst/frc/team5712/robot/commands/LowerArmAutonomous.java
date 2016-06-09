package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LowerArmAutonomous extends Command {
	
    public LowerArmAutonomous() {
        requires(Robot.shooterSubsystem);
    }

    protected void initialize() {
    	Robot.shooterSubsystem.armDown();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.shooterSubsystem.isDownAutonomous();
    }

    protected void end() {
    	Robot.shooterSubsystem.stopArm();
    	Robot.shooterSubsystem.resetShooterEncoder();
    }

    protected void interrupted() {
    	System.out.println("Lowering Interupted");
    	end();
    }
}
