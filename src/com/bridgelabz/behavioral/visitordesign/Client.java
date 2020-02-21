package com.bridgelabz.behavioral.visitordesign;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/**Title:Visitor Design Pattern
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		LinkedHashMap<String, Product> productMap = ShopeProducts.productMap;

		Set<String> products = productMap.keySet();

		System.out.println("Products Available \n");

		for (String string : products) {
			System.out.println(productMap.get(string));
		}



		ArrayList<Product> purchasedProductList = new ArrayList<Product>();
		//Client buying products
		purchasedProductList.add(productMap.get("twoStates"));
		purchasedProductList.add(productMap.get("theSecret"));
		purchasedProductList.add(productMap.get("blackPen"));
		purchasedProductList.add(productMap.get("bluePen"));
		purchasedProductList.add(productMap.get("oneLine"));
		purchasedProductList.add(productMap.get("fourLine"));
		ShopeProducts shopeProducts = new ShopeProducts();
		System.out.println("Total Amount : " + shopeProducts.getTotalAmount(purchasedProductList) + "Rs");

	}

}
