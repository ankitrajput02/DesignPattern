package com.bridgelabz.creationaldesign.factory.operation;

import com.bridgelabz.creationaldesign.factory.model.ComputerInterface;
import com.bridgelabz.creationaldesign.factory.model.Laptop;
import com.bridgelabz.creationaldesign.factory.model.PC;
import com.bridgelabz.creationaldesign.factory.model.Server;

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
