
public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return Math.PI *(radius*radius);
	}
	public String toString() {
		return "radius = "+ getRadius();
	}
}
