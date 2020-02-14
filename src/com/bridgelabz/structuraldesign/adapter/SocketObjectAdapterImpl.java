package com.bridgelabz.structuraldesign.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private ElectricSocket electricSocket = new ElectricSocket();

	@Override
	public Volt get3Volt() {
		Volt volt = electricSocket.getVolt();
		System.out.println("From Electric socket mobile phone charger got :" + volt.getVolts() + "v");
		Volt convertedVolt = convertVolt(volt, 80);
		System.out.println(
				"Mobile Phone Charger converted " + volt.getVolts() + "v to " + convertedVolt.getVolts() + "v");
		return convertedVolt;
	}

	public Volt get12Volt() {
		Volt volt = electricSocket.getVolt();
		System.out.println("\nFrom Electric socket mobile phone charger got :" + volt.getVolts() + "v");
		Volt convertedVolt = convertVolt(volt, 20);
		System.out.println(
				"Mobile Phone Charger converted " + volt.getVolts() + "v to " + convertedVolt.getVolts() + "v");
		return convertedVolt;
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
