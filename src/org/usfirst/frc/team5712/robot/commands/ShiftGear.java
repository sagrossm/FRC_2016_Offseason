package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftGear extends Command {

    public ShiftGear() {
    	requires(Robot.solenoidSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.solenoidSubsystem.shiftHigh();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	Robot.solenoidSubsystem.shiftLow();
    }

    protected void interrupted() {
    	System.out.println("Shifting Interupted");
    	end();
    }
}
