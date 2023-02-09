
public class Cylinder extends Circle{
	private double height;
	public Cylinder(double radius, double height) {
		super(radius, null);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea() * getHeight();
	}
	public double getArea() {
		return Math.PI * (super.getRadius() * getHeight());
	}
	public String toString() {
		return "height = ["+ getHeight() +"],["+getRadius()+"]"; 
	}
}
