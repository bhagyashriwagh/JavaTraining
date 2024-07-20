package Interfac;

import java.awt.geom.Area;

public class Circle implements Shape,colour {
	
	double radius=10;

	public void area() {
		double area=pi*radius*radius;
		
		System.out.println("area="+area);
		
	}
	
	public void volume() {
		double vol=4/3*pi*radius*radius*radius;
		System.out.println("volume="+vol);
		
	}

	public void perimeter() {
		double perimeter= 2*pi*radius;
		System.out.println("perimeter="+perimeter);
	}

	public void setcolour() {
		System.out.println("colour is green");
		}
	
	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.area();
		obj.volume();
		obj.perimeter();
		obj.setcolour();
		
		
		
	}

	
	
	
}
