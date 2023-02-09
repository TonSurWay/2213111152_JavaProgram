import javax.swing.JOptionPane;

public class ShapeDemo3 {
	public static void main(String[] args) {
		Cylinder cylinder[] = new Cylinder[5];
		for (int i = 0; i < cylinder.length; i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input  radius : "));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input  height : "));
	
			cylinder[i] = new Cylinder(radius, height);
		}
		int count = 1;
		String str = "";
		for (Cylinder cy:cylinder) {
			str = str +"Cylinder "+ count +", volume="+cy.getVolume()+"\n";
			count++;
			
		}
		JOptionPane.showMessageDialog(null, str);
	}
}
