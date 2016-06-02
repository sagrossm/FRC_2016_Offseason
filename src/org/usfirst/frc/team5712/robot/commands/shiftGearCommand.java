package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class shiftGearCommand extends Command {

    public shiftGearCommand() {
    	requires(Robot.shooterSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooterSubsystem.doubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	Robot.shooterSubsystem.doubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }

    protected void interrupted() {
    	end();
    }
}
