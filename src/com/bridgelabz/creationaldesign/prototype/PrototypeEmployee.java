package com.bridgelabz.creationaldesign.prototype;

public class PrototypeEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Company comp = new Company();
		comp.setcName("TATA");
		comp.loadData();
		System.out.println("Original Data");
		System.out.println(comp);
		Company comp1 = comp.clone();
		comp.getEmp().remove(2);
		System.out.println("After Remove");
		System.out.println(comp);
		comp1.setcName("TCS");
		System.out.println("Clone Data");
		System.out.println(comp1);
	}

}
