package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class shootCommand extends Command {
	
    public shootCommand() {
        requires(Robot.shooterSubsystem);
        setTimeout(2);
    }

    protected void initialize() {
    	Robot.shooterSubsystem.shoot();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
		Robot.shooterSubsystem.shooterL.set(0); //stops the left shooting motor
		Robot.shooterSubsystem.shooterR.set(0); //stops the right shooting motor
		Robot.shooterSubsystem.shooter.set(DoubleSolenoid.Value.kReverse);
    }

    protected void interrupted() {
    	System.out.println("Shooting Interrupted");
    	end();
    }
}
