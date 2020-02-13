package com.bridgelabz.creationaldesign.singleton;

public class EnumSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDemo obj1=EnumDemo.INSTANCE;
		obj1.count=10;
		obj1.show();
	}

}
enum EnumDemo{
	INSTANCE;
	int count;
	public void show() {
		System.out.println(count);
	}
}
