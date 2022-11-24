import javax.swing.*;
import java.text.*;
import java.util.*;

public class IncomeTaxCalculator {
	static final double TAX_RATE_ABOVE_20K = 0.1;
	static final double TAX_RATE_ABOVE_40K = 0.2;
	static final double TAX_RATE_ABOVE_60K = 0.3;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("0.00");
		for (int i = 1; i < 8; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the taxable income: $");
			int taxableIncome = scan.nextInt();
			double taxPayable = 0;
			if (taxableIncome <= 20000) {
				taxPayable = 0;
				System.out.println("The income tax payable is: $" + frm.format(taxPayable));
			} else if (taxableIncome <= 40000) { // [20001, 40000]
				taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;

			} else if (taxableIncome <= 60000) { // [40001, 60000]
				taxPayable = (taxableIncome - 30000) * TAX_RATE_ABOVE_40K;

			} else { // [60001, ]
				taxPayable = (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
			}
			System.out.println("The income tax payable is: $" + frm.format(taxPayable));
		}
	}

}
