package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class solenoidOutCommand extends Command {

    public solenoidOutCommand() {
    	requires(Robot.shooterSubsystem);
    	setTimeout(.5);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooterSubsystem.shooter.set(DoubleSolenoid.Value.kForward);
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
