/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Sensor {
	
	private String type;
	private int range;
	
	public Sensor(String type, int range) {
		this.type = type;
		this.range = range;
	}
	
	public void detectLight() {
		System.out.println("Natural light detected");
	}
	
	public void scanObjects() {
		System.out.println("Objects detected");
	}
	
	public void detectSound() {
		System.out.println("Sound towards the left");
	}
	
	public void detectSpeed() {
		System.out.println("Speed of the vehicle overtaking on the right is 45 MPH");
	}

}
