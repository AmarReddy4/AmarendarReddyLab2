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

}
