package com.bridgelabz.creationaldesign.factory.computer.operation;

import com.bridgelabz.creationaldesign.factory.computer.ComputerInterface;
import com.bridgelabz.creationaldesign.factory.computer.Laptop;
import com.bridgelabz.creationaldesign.factory.computer.PC;
import com.bridgelabz.creationaldesign.factory.computer.Server;

public class ComputerFactory {
	public static ComputerInterface createComputer(ComputerType type, String ram, String hdd, String cpu) {
		ComputerInterface computer = null;
		switch (type) {
		case PC:
			computer = new PC(ram, hdd, cpu);
			break;
		case SERVER:
			computer = new Server(ram, hdd, cpu);
			break;
		case LAPTOP:
			computer = new Laptop(ram, hdd, cpu);
			break;
		}

		return computer;

	}

}
