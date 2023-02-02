import javax.swing.JOptionPane;

public class Shop100Baht {
	public static void main(String[] args) {
		Product1 arnupab = new Product1();
		
		int button =JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?" , "Run Program" ,0);
		if(button==0) {
			arnupab = new PattanakarnBranch();
		}

		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"))); // call toString
		
		
		JOptionPane.showMessageDialog(null, arnupab);

	}
}
