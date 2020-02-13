package com.bridgelabz.creationaldesign.factory;



import com.bridgelabz.creationaldesign.factory.model.ComputerInterface;
import com.bridgelabz.creationaldesign.factory.operation.ComputerFactory;
import com.bridgelabz.creationaldesign.factory.operation.ComputerType;

public class Computer {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ComputerInterface pc = new ComputerFactory().createComputer(ComputerType.PC, "2GB", "250GB", " i5");
		System.out.println(pc);
		ComputerInterface server = new ComputerFactory().createComputer(ComputerType.SERVER, "16GB", "2TB", " i7");
		System.out.println(server);
		ComputerInterface laptop = new ComputerFactory().createComputer(ComputerType.LAPTOP, "8GB", "1TB", "i5");
		System.out.println(laptop);
	}

}
