package com.bridgelabz.structuraldesign.proxy.imageproxy;

public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			System.out.println("Original Image");
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
