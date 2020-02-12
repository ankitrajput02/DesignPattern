package com.bridgelabz.creationaldesign;

public class BillPugh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPughDemo.getInstance();
		//BillPughDemo.getInstance();
	}

}
class BillPughDemo{
	private BillPughDemo() {
		System.out.println("Instance Created in Bill Pugh");
	}
	private static class InnerClass{
		private static final BillPughDemo INSTANCE= new BillPughDemo(); 
	}
	public static BillPughDemo getInstance() {
		return InnerClass.INSTANCE;
	}
}