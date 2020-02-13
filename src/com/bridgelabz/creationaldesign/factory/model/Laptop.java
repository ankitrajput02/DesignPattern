package com.bridgelabz.creationaldesign.factory.model;

public class Laptop implements ComputerInterface {
	String ram;
	String hdd;
	String cpu;

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public Laptop(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop [RAM=" + ram + ", HDD=" + hdd + ", CPU=" + cpu + "]";
	}

}
