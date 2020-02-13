package com.bridgelabz.creationaldesign.factory.model;

public class Server implements ComputerInterface {
	String ram;
	String hdd;
	String cpu;
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
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

	@Override
	public String toString() {
		return "Server [RAM=" + ram + ", HDD=" + hdd + ", CPU=" + cpu + "]";
	}
	
}
