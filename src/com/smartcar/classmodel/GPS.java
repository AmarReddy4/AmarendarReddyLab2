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
	
	public void navigate() {
		System.out.println("Navigating to Hyderabad");
	}
	
	public void setDestination() {
		System.out.println("Destination to New York set");
	}
	
	public void saveLocations() {
		System.out.println("Location: FIU saved as school");
	}
	
	public void particleFiltering() {
		System.out.println("Improved accuracy");
	}
	
	public void updateProximity() {
		System.out.println("Proximity updated");
	}
	
	public void updateVersion() {
		System.out.println("Maps version updated, current version is 15.9");
	}
	
	


}
