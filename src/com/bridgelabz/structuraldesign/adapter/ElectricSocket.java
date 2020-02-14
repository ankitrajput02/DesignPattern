package com.bridgelabz.structuraldesign.adapter;

public class ElectricSocket {
	public Volt getVolt() {
		return new Volt(240);
	}
}
