package com.bridgelabz.creationaldesign.factory.computer;

/**
 * Getters and Setters for PC
 *
 */
public class PC implements ComputerInterface {
	String ram;
	String hdd;
	String cpu;

	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



	@Override
	public String toString() {
		return "PC [RAM=" + ram + ", HDD=" + hdd + ", CPU=" + cpu + "]";
	}



	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getCpu() {
		return cpu;
	}

}
