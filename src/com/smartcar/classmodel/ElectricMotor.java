/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class ElectricMotor {
	
	private float powerUsage;
	private int voltage;
	private double horsePower;
	
	
	public ElectricMotor(float powerUsage, int voltage, double horsePower) {
		this.powerUsage = powerUsage;
		this.voltage = voltage;
		this.horsePower = horsePower;
	}
	
	public void supplyElectricity() {
		System.out.println("Electricity from battery to the motor and other systems");
	}
	
	public void start() {
		System.out.println("Vehicle started");
	}
	
	

}
