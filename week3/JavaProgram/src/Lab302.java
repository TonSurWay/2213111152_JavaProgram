import javax.swing.*;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.0");
		double Weight = Double.parseDouble
				(JOptionPane.showInputDialog
				("Input Weight: "));
		double Height = Double.parseDouble
				(JOptionPane.showInputDialog
				("Input Height: "));
		double BMI = Weight/((Height*Height)/100)*100;
		JOptionPane.showMessageDialog(null, 
				"BMI = "+frm.format(BMI)+
				"\nYou're "+(BMI<=18.5?"Underweight":
					BMI<=24.9?"Normal-weight":
					BMI<=29.90?"Overweight":"Obesity"),"BMI",JOptionPane.WARNING_MESSAGE);

	}

}
