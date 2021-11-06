/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Suspension {
	
	private String actuator;
	
	public Suspension(String actuator) {
		this.actuator = actuator;
	}
	
	public void createForce() {
		System.out.println("High altitude ahead, a 5 inch force created");
	}


}
