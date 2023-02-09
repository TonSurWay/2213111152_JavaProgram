import javax.swing.*;

public class RectangleDemo1 {
	public static void main(String[] args) {

		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input Length : "));
		String color = JOptionPane.showInputDialog("Input Color : ");

		Rectangle rec = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rec+ "\nArea of Rectangle is "+ rec.getArea()); // call method toString from Rectangle class
	}
}
