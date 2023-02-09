import java.util.Scanner;

public class ShapeDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder cylinder[] = new Cylinder[5];
		for (int i = 0; i < cylinder.length; i++) {
			System.out.print("Input radius " + (i + 1) + ":");
			double radius = scan.nextDouble();
			System.out.print("Input height " + (i + 1) + ":");
			double height = scan.nextDouble();

			cylinder[i] = new Cylinder(radius, height);

		}
		int count = 1;
		for (Cylinder cy:cylinder) {
			System.out.println("Cylinder "+count+"," + "volume=" +cy.getVolume());
			count++;
		}
		
	}
}
