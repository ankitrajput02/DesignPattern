package com.bridgelabz.behavioral.visitordesign;

/**
 * concret class for product Book and getter setter methods
 *
 */
public class Book extends Product {
	private String name;
	private String isbnNumber;

	 public Book( String name, String isbnNumber, int price )
	 {
	 super();
	 this.name = name;
	 this.isbnNumber = isbnNumber;
	 this.price = price;
	 }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	@Override
	public void accept(ShopeVisitor shopeVisitor) {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Book [Book Name = " + name + ", ISBN Number = " + isbnNumber + "]";
	}

}
