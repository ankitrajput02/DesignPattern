package com.bridgelabz.structuraldesign.proxy.imageproxy;

public class ProxyImageMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("rickmorty.jpg");
		// Original Image
		image.display();
		System.out.println("Proxy Image");
		image.display();
	}
}
