package com.bridgelabz.behavioral.visitordesign;

/**
 * concret class for product Notebook and getter methods
 *
 */
public class Notebook extends Product {

	private String productOf;

	public Notebook(String productOf, int price) {
		super();
		this.productOf = productOf;
		this.price = price;
	}

	public String getProductOf() {
		return productOf;
	}

	@Override
	public String toString() {
		return "Notebook [Product Company = " + productOf + ", Price = " + price + "]";
	}

	@Override
	public void accept(ShopeVisitor shopeVisitor) {
		shopeVisitor.visit(this);
	}

}
