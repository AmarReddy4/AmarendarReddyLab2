/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Drive {
	
	private String drivingMode;
	
	public Drive(String drivingMode) {
		this.drivingMode = drivingMode;
	}
	
	public void driverAssistance() {
		System.out.println("Manual Driving mode");
	}
	
	public void partialAutomation() {
		System.out.println("Cruise mode");
	}
	
	public void conditionalAutomation() {
		System.out.println("Auto brake and accelertate mode");
	}
	
	public void highAutomation() {
		System.out.println("Steering in your control");
	}
	
	public void fullAutomation() {
		System.out.println("Auto Pilot mode");
	}
	

}
