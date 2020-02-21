package com.bridgelabz.creationaldesign.singleton;

/**
 * Title:Eager Initialization Java code to create singleton class by Eager
 * Initialization.
 * Created By:Ankit Rajput
 * 
 *
 */
public class EagerInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationDemo.getInstance();
		//
		// EagerInitializationDemo obj=EagerInitializationDemo.getInstance();
		// EagerInitializationDemo obj1=EagerInitializationDemo.getInstance();
	}

}

class EagerInitializationDemo {
	public static EagerInitializationDemo obj = new EagerInitializationDemo(); // Eager Initialization
	// public static EagerInitializationDemo obj; //Lazy initialization

	private EagerInitializationDemo() { // Private Constructor
		System.out.println("Instance Created");
	}

	public static EagerInitializationDemo getInstance() {
		// if(obj == null){
		// obj=new EagerInitializationDemo();
		// }
		return obj;
	}
}
