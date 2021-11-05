/**
 * 
 */
package com.smartcar.classmodel;

/**
 * @author amar0204
 *
 */
public class Car {

	private static Car myCar;
	/**
	 * @param args
	 */
	
	private String carName;
	private String owner;
	private String make;
	private String licensePlateNumber;
	
	public Car(String carName, String licensePlateNumber, String owner, String make) {
		this.carName = carName;
		this.licensePlateNumber = licensePlateNumber;
		this.owner = owner;
		this.make = make;
	}
	
//	public String toString() {
//		return carName;
//	}
	
	public static void moveForward() {
		System.out.println("Moving Forward");
	}
	
	public static void moveBackward() {
		System.out.println("Moving Backward");
	}
	
	public static void turnRight() {
		System.out.println("Turning Right");
	}
	
	public static void turnLeft() {
		System.out.println("Turning Left");
	}
	
	public static void park() {
		System.out.println("Parking");
	}
	
	public static void stop() {
		System.out.println("Coming to a complete stop");
	}
	
	public static void carStatus() {
		System.out.println("Car Condition: Normal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car.myCar = new Car("Atlas", "NUM1234", "Amar", "Audi");
		System.out.println("Car name: " + myCar.carName);
		System.out.println("License Plate Number: " + myCar.licensePlateNumber);
		System.out.println("Owner: " + myCar.owner);
		System.out.println("Car name: " + myCar.make);
		moveForward();

	}

}
