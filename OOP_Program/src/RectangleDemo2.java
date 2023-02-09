import java.util.Scanner;

public class RectangleDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Width : ");
		double width = Double.parseDouble(scan.next());
		System.out.print("Input Length : ");
		double length = Double.parseDouble(scan.next());
		 Rectangle2 rec = new Rectangle2(width, length);
		 
		 System.out.println(rec + "\nArea of Rectangle is " + rec.getArea());
	}
}
