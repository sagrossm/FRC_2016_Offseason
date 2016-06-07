package org.usfirst.frc.team5712.robot.commands;

import org.usfirst.frc.team5712.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class switchCamCommand extends Command {

    public switchCamCommand() {
        requires(Robot.cameraSubsystem);
    }

    protected void initialize() {
    	//Robot.cameraSubsystem.switchCam();
    }

    protected void execute() {
    	
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
