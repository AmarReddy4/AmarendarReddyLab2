/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Battery {
	
	private float capacity;
	private String batteryStatus;
	
	public Battery(float capacity, String batteryStatus) {
		this.capacity = capacity;
		this.batteryStatus = batteryStatus;
	}
	
	public void charge() {
		System.out.println("Charging");
	}
	
	public void turnOn() {
		System.out.println("Battery turned ON");
	}
	
	public void turnOff() {
		System.out.println("Battery turned Off");
	}
	
	public void batteryHealthCheck() {
		System.out.println("Batter Health: Normal");
	}

}
