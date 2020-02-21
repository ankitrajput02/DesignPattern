package com.bridgelabz.behavioral.visitordesign;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ShopeProducts {

	static LinkedHashMap<String, Product> productMap;

	static {
		productMap = new LinkedHashMap<String, Product>();
		//Available Products
		Book untoldStory = new Book("Untold Story", "ISBN-999", 200);
		Book twoStates = new Book("Two States", "ISBN-1999", 300);
		Book theSecret = new Book("The Secret", "ISBN-2999", 0);

		Notebook drawingBook = new Notebook("Navneet", 50);
		Notebook oneLine = new Notebook("Classmate", 150);
		Notebook fourLine = new Notebook("Classmate", 120);

		Pen blackPen = new Pen("Black", "Cello", 15);
		Pen bluePen = new Pen("Blue", "Pilot", 25);
		Pen redPen = new Pen("Red", "Reynolds", 40);
		//map the product
		productMap.put("untoldStory", untoldStory);
		productMap.put("twoStates", twoStates);
		productMap.put("theSecret", theSecret);
		productMap.put("drawingBook", drawingBook);
		productMap.put("oneLine", oneLine);
		productMap.put("fourLine", fourLine);
		productMap.put("blackPen", blackPen);
		productMap.put("bluePen", bluePen);
		productMap.put("redPen", redPen);

	}

	public int getTotalAmount(ArrayList<Product> purchasedProductList) {

		Cashier cashier = new Cashier("Krunal");

		System.out.println("Puschased Products details : \n");
		for (Product product : purchasedProductList) {
			// Each product accepts the visitor
			product.accept(cashier);
			System.out.print(product + "\n");
		}
		return cashier.getTotalPrice();
	}

}
