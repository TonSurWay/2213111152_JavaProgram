import javax.swing.*;
import java.text.*;

public class Java04 {

	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("$00.0");
		
		
		String Id;
		Id = JOptionPane.showInputDialog("This program calculates the total cost of a CD order "
				+ "\nPlease enter the ID of the CD");
		String Title;
		Title = JOptionPane.showInputDialog("Please enter the title of the CD");
		
		int Quantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		float Price = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of the CD in U.S dollars"));
		 float Subtotal = Quantity * Price;
		 final double TAX_RATE = .0625;
		 double Total = Subtotal * (1+TAX_RATE);
		 
		 JOptionPane.showMessageDialog(null, "Summary of the transaction:" + "\n\nCD ID:"+ Id +"\nCDTitle:" 
		 + Title + "\nCD Unit Price:"+ Price + "\nCD Quantity:" + Quantity + 
		 "\n\nSubtotal:" +frm.format(Subtotal) + "\nTax rate:" + TAX_RATE*100+"%" +"\nTotal:"+"$"+Total + "\n\nEnd of Program");
		 
		 
	}
}
