/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Tire {
	
	private String tire;
	private Boolean smartTireMode;
	private float width;
	private float airPressure;
	
	public Tire(String tire, Boolean smartTireMode, float width, float airPressure) {
		this.tire = tire;
		this.smartTireMode = smartTireMode;
		this.width = width;
		this.airPressure = airPressure;
	}
	
	public void treadDepthSensor() {
		System.out.println("Running at a certain depth");
	}
	
	public void checkAir() {
		System.out.println("Tire air pressure is normal");
	}
	
	public void tireWearStatus() {
		System.out.println("Tire status is Normal");
	}

}
