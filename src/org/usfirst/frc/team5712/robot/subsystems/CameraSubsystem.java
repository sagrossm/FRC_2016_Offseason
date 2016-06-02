package org.usfirst.frc.team5712.robot.subsystems;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CameraSubsystem extends Subsystem {
	
	Image frame;
	int sessionFront, sessionBack, currSession;

    public void initDefaultCommand() {
    }
    
    public void cameraInit(){
		/*frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
		sessionFront = NIVision.IMAQdxOpenCamera("cam0", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		sessionBack = NIVision.IMAQdxOpenCamera("cam1", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
		currSession = sessionFront;
		NIVision.IMAQdxConfigureGrab(currSession);
    }
    
    public void switchCam(){
    	if (currSession == sessionFront) {
			NIVision.IMAQdxStopAcquisition(currSession);
			currSession = sessionBack;
			NIVision.IMAQdxConfigureGrab(currSession);
		} 
		else if (currSession == sessionBack) {
			NIVision.IMAQdxStopAcquisition(currSession);
			currSession = sessionFront;
			//currSession = sessionShoot;
			NIVision.IMAQdxConfigureGrab(currSession);
		} */
    }
}

