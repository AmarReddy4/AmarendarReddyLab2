/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class GPS {
	
	private float mapVersion;
	private float latitude;
	private float longitude;
	private String currentLocation;
	
	public GPS(float mapVersion, float latitude, float longitude, String currentLocation) {
		this.mapVersion = mapVersion;
		this.latitude = latitude;
		this.longitude = longitude;
		this.currentLocation = currentLocation;
		
	}


}
