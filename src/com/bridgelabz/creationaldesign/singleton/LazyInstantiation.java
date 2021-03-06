package com.bridgelabz.creationaldesign.singleton;

/**
 * Title:Lazy initialization method to implement Singleton pattern creates the
 * instance in the global access method.
 * Created By:Ankit Rajput
 *
 */
public class LazyInstantiation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyDemo obj = LazyDemo.getInstance();
		LazyDemo obj1 = LazyDemo.getInstance();
	}

}

class LazyDemo {

	public static LazyDemo obj; // Lazy initialization

	private LazyDemo() { // Private Constructor
		System.out.println("Instance Created");
	}

	public static LazyDemo getInstance() {
		if (obj == null) {
			obj = new LazyDemo();
		}
		return obj;
	}
}
