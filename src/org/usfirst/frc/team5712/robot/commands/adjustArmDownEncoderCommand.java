package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class adjustArmDownEncoderCommand extends Command {

	double shootTickGoal = 10 * -7.5; //tick to degree ratio (degrees/tick) * angle desired
    boolean finished;
    
	public adjustArmDownEncoderCommand() {
    	requires(Robot.liftSubsystem);
    	requires(Robot.shooterSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
    	if(Robot.shooterSubsystem.shooterEncoder.get() > shootTickGoal) { 
			//raise the shooting arm to 75 degrees
				Robot.liftSubsystem.shooterLift.set(0.25);
			}
			else if (Robot.shooterSubsystem.shooterEncoder.get() < shootTickGoal) {
				Robot.liftSubsystem.shooterLift.set(-0.25);
				finished = true;
			}
    }

    protected boolean isFinished() {
        return finished;
    }

    protected void end() {
    	Robot.liftSubsystem.shooterLift.set(0);
    }

    protected void interrupted() {
    	System.out.println("Adjustment of Shooter Arm Down: Interrupted");
    	end();
    }
}
