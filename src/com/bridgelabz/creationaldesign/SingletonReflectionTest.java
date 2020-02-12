package com.bridgelabz.creationaldesign;

import java.lang.reflect.Constructor;

public class SingletonReflectionTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerInitializationDemo instanceOne = EagerInitializationDemo.getInstance();
		//EagerInitializationDemo instanceTwo = null;
		try {

			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				//instanceTwo = (EagerInitializationDemo) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		//System.out.println(instanceTwo.hashCode());

	}

}
