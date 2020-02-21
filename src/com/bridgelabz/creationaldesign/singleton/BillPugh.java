package com.bridgelabz.creationaldesign.singleton;

/**
 * Title: Bill Pugh Singleton Implementation.
 * Created By:Ankit Rajput
 *
 */
public class BillPugh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPughDemo.getInstance();
		BillPughDemo.getInstance();
	}

}

class BillPughDemo {
	private BillPughDemo() {
		System.out.println("Instance Created in Bill Pugh");
	}

	/**
	 * private inner static class that contains the instance of the singleton class.
	 * When the singleton class is loaded, InnerClass class is not loaded into
	 * memory and only when someone calls the getInstance method, this class gets
	 * loaded and creates the Singleton class instance
	 * 
	 *
	 */
	private static class InnerClass {
		private static final BillPughDemo INSTANCE = new BillPughDemo();
	}

	public static BillPughDemo getInstance() {
		return InnerClass.INSTANCE;
	}
}