package com.bridgelabz.behavioral.visitordesign;

/**
 * Concrete class for product Pen
 * and getter methods
 *
 */
public class Pen extends Product {

	private String penType;
	private String company;

	public Pen(String penType, String company, int price) {
		super();
		this.penType = penType;
		this.company = company;
		this.price = price;
	}

	public String getPenType() {
		return penType;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public void accept(ShopeVisitor shopeVisitor) {
		shopeVisitor.visit(this);
	}

	@Override
	public String toString() {
		return "Pen [Pen Type = " + penType + ",Pen Company = " + company + ", Price = " + price + "]";
	}

}
