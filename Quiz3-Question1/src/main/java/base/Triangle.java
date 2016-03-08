package base;

import java.lang.Math;
import base.GeometricObject;

public class Triangle extends GeometricObject {

	// These three are just declaring the private data fields which are side1, side2, and side3.
	// The instructions did not say to make them private, but I know it is good practice to do so..
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	// default Constructor
	public Triangle(){
		
	}
	
	// Constructor with the prescribed triangle values
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * @return the side1
	 */
	// getter for side1
	public double getSide1() {
		return this.side1;
	}

	/**
	 * @return the side2
	 */
	// getter for side2
	public double getSide2() {
		return this.side2;
	}

	/**
	 * @return the side3
	 */
	// getter for side3
	public double getSide3() {
		return this.side3;
	}
		
	// This method returns the area of any triangle by making use of Heron's formula
	@Override
	public double getArea(){
		// We can easily calculate the area of any triangle using Heron's formula, which the variable 's' is in relation to.
		double s = (.5)*(side1+side2+side3);
		double radicand = s*(s-side1)*(s-side2)*(s-side3);
		double Area = Math.pow(radicand, .5);
		return Area;
	}
		
	// This method gets the perimeter of a triangle, which is the sunm of the lengths of each side of the triangle.
	@Override
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	// This method will simply print the sides of the triangle, the area of the triangle, and the perimeter of the triangle.
	// Refer to GeometricObject class to see the manner in which I set up this toString method.
	public String toString(){
		return "The length of side 1 is " + side1 + ", The length of side 2 is " + side2 + ", the length of side3 is "
				+ side3 + ", the area of the triangle is " + getArea() + ", and the Perimeter of the triangle is " + getPerimeter() + ".";
	}
}

