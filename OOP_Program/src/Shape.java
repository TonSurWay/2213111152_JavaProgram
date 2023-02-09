
public abstract class Shape {
private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	public Shape() {
		color = null;
	}
	//Abstract method
	public abstract double getArea();
	
	//return String in form "color" = [color]
	public String toString() {
		return "color = "+ this.color;
	}
}
