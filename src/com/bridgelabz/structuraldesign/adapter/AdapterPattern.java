package com.bridgelabz.structuraldesign.adapter;

public class AdapterPattern {
	public static void main(String args[]) {
		new AdapterPattern().chargeMe();

	}

	public void chargeMe() {
		SocketAdapter adapter = new SocketObjectAdapterImpl();
		Volt v3 = adapter.get3Volt();
		System.out.println("Mobile phone is charging using : " + v3.getVolts() + "v");
		Volt v12 = adapter.get12Volt();
		System.out.println("Mobile phone is charging using : " + v12.getVolts() + "v");

	}

}