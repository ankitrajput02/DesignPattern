package com.bridgelabz.structuraldesign.facade.shapedraw;

/**Title:facade design pattern
 * Created By:Ankit Rajput
 */
public class FacadeDesignMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapeMaker=new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
