package Interfac;

public class rectangular implements Shape{
	
	double length=50;
	double height=40;
	double width=80;
			

	public void area() {
		double area=length*height;
		System.out.println("area="+area);
		
	}

	public void volume() {
		double volume=length*height*width;
		System.out.println("volume="+volume);
		
	}

	public void perimeter() {
		double peri=length+height;
		System.out.println("perimeter="+peri);
		
	}
	
	public static void main(String[] args) {
		rectangular a=new rectangular();
		a.area();
		a.volume();
		a.perimeter();
		
	}

	
}
