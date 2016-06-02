package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class solenoidInCommand extends Command {
	
    public solenoidInCommand() {
        requires(Robot.shooterSubsystem);
        setTimeout(.5);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooterSubsystem.shooter.set(DoubleSolenoid.Value.kReverse);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    	System.out.println("solenoidIn: Interrupted");
    	end();
    }
}
