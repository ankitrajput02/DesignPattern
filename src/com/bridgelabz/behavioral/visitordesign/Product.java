package com.bridgelabz.behavioral.visitordesign;

/*
 * Visitable Class
 */
public abstract class Product {
	protected int price;

	public abstract void accept(ShopeVisitor shopeVisitor);

	public int getPrice() {
		return price;
	}
}
