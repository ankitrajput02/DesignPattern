package com.bridgelabz.creationaldesign.singleton;

/**
 * Title:Enum Singleton use of Enum to implement Singleton design pattern as
 * Java ensures that any enum value is instantiated only once in a Java program
 * Created By:Ankit Rajput
 *
 */
public class EnumSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDemo obj1 = EnumDemo.INSTANCE;
		obj1.count = 10;
		obj1.show();
	}

}

enum EnumDemo {
	INSTANCE;
	int count;

	public void show() {
		System.out.println(count);
	}
}
