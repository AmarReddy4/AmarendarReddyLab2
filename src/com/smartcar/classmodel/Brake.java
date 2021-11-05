/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Brake {
	
	private String brakeSystem;
	
	public Brake(String brakeSystem)  {
		this.brakeSystem = brakeSystem;
	}
	
	public void applyBrake() {
		System.out.println("Brake applied");
	}
	
	public void autoBrake() {
		System.out.println("Auto brake mode activated");
	}
	
	public void brakeDiagnostics() {
		System.out.println("Auto braking system failure");
	}

}
