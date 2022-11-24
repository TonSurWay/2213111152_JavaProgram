import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int pricePerson = 299;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill? "));
		double totalprice = numberofCustomer * pricePerson;
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null,
					"Total Price is " + frm.format(totalprice) + "baht." + "\nDo you have a member card?");
		} while (memberCard == 2);

		if (memberCard == 0) {
			totalprice = totalprice * 90 / 100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalprice) + " baht.");

		} else if (memberCard == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalprice) + " baht.");
		}
	}

}
