/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Camera {
	
	private float cameraVersion;
	private int resolution;
	
	public Camera(float cameraVersion, int resolution) {
		this.cameraVersion = cameraVersion;
		this.resolution = resolution;
	}
	
	public void recognizeObjects() {
		System.out.println("Recognised a car on the right");
	}
	
	public void controlMotion()
	{
		System.out.println("Vehicle motion in control");
	}
	
	public void model3DScenes()
	{
		System.out.println("A giant vehicle coming from behind");
	}
	
	public void captureVisualData()
	{
		System.out.println("Pedestrians ahead");
	}
	
	public void lowVisibilityWarning()
	{
		System.out.println("It's raining, USE the Radar");
	}

}
