package com.bridgelabz.creationaldesign.singleton;

public class LazyInstantiation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyDemo obj = LazyDemo.getInstance();
		LazyDemo obj1 = LazyDemo.getInstance();
	}

}
class LazyDemo {
	
	public static LazyDemo obj; //Lazy initialization
	private LazyDemo() { // Private Constructor
		System.out.println("Instance Created");
	}

	public static LazyDemo getInstance() {
		if(obj == null){
		obj=new LazyDemo();
		}
		return obj;
	}
}
