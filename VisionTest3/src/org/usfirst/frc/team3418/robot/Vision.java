package org.usfirst.frc.team3418.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

public class Vision {

	static Vision mInstance = new Vision();

    public static Vision getInstance() {
        return mInstance;
    }
    
	UsbCamera camera;
	
	public Vision(){
        camera = CameraServer.getInstance().startAutomaticCapture("camera 0", 0);
        camera.setResolution(640, 480);
        camera.setFPS(30);
	}
}