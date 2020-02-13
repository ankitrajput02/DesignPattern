package com.bridgelabz.creationaldesign.singleton;

/**
 * Instance of class is created in the static block that provides option for
 * exception handling
 */
public class StaticBlockInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock.getInstanceBlock();
	}

}

class StaticBlock {
	public static StaticBlock instance;

	private StaticBlock() {
		System.out.println("This is Private instance");
	}

	static {
		try {
			instance = new StaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Static Block Exception Handling");
		}
	}

	public static StaticBlock getInstanceBlock() {
		return instance;
	}
}
