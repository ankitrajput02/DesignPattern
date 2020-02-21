package com.bridgelabz.structuraldesign.adapter.electric;

/**
 * Electric Socket
 *
 */
public class ElectricSocket {
	public Volt getVolt() {
		return new Volt(240);
	}
}
