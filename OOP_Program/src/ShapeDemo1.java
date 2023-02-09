import java.util.Scanner;

public class ShapeDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius, null);
		System.out.println("Circle["+circle+"]" +"\nCircle[area = "+circle.getArea());
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println();
		System.out.println("Cylinder["+cylinder+"]"+
		"\nCylinder[area = "+cylinder.getArea()+"]"+
		"\nCylinder[area = "+cylinder.getVolume()+"]");
	}
}
