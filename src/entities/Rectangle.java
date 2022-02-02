package entities;

public class Rectangle {
	// Atributos
	public double width;
	public double height;
	
	// Métodos públicos 
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
