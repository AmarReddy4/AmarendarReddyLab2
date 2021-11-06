/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class ProcessingUnit {
	
	private double memory;
	private String model;
	private float osVersion;
	
	public ProcessingUnit(double memory, String model, float osVersion) {
		this.memory = memory;
		this.model = model;
		this.osVersion = osVersion;
	}
	
	public void processSensorData() {
		System.out.println("Sensors interacting");
	}
	
	public void communicate() {
		System.out.println("Reminder for servicing sent");
	}
	
	public void runDiagnostics() {
		System.out.println("System memory overloaded");
	}


}
