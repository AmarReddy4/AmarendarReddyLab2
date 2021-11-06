/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Operation {
	
	private Boolean pitchUpAltitude;
	private Boolean pitchDownAltitude;
	
	public Operation(Boolean pitchUpAltitude, Boolean pitchDownAltitude) {
		this.pitchUpAltitude = pitchUpAltitude;
		this.pitchDownAltitude = pitchDownAltitude;
	}
	
	public void steering() {
		System.out.println("Steering to the left");
	}
	
	public void acceleration() {
		System.out.println("Accelerating 1500 RPM");
	}
	
	public void deceleration() {
		System.out.println("Decelerating");
	}

}
