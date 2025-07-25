package Task1;

abstract class Shape {
	 abstract double area();
	}
	class Circle extends Shape {
	int radius;
	 Circle(int r) {
	 radius = r;
	 }
	 double area() {
	 return Math.PI * radius * radius;
	 }
	}
	class Rectangle extends Shape {
	 double length, bredth;
	 Rectangle(double l, double b) {
	 length = l;
	 bredth = b;
	 }
	 double area() {
	 return length * bredth;
	 }
	}
	public class AbstractClass {
	 public static void main(String[] args) {
	 Shape sh1 = new Circle(5);
	 Shape sh2 = new Rectangle(4, 6);
	 System.out.println("Area of circle is: " + sh1.area());
	 System.out.println("Area of rectangle is: " + sh2.area());
	 }
	}
