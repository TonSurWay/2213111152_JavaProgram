import java.util.*;
import java.text.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		final double COMMISION_RATE = 0.15;
		final int SENTINEL = -1;
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("##,###.00");
		int sale;
		double salary;
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end):");
			sale = scan.nextInt();
			if(sale == SENTINEL) {
				System.out.print("bye");
				break;
			}
			salary = sale*COMMISION_RATE+1000;
			System.out.println("Salary is: $"+frm.format(salary));
			System.out.println();
		}

	}

}
