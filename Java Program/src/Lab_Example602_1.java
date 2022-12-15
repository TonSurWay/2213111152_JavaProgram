import javax.swing.*;

public class Lab_Example602_1 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };

	static double itemPrice = 0;
	static boolean validItem = false; // ค่าเริ่มต้นเป็นfalseเสมอ
	static int itemOrder;

	public static void main(String[] args) {

		inputItem();
	} // end of Main

	public static void inputItem() {
		itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		//boolean chkItem = checkItem(itemOrder);
		if (checkItem(itemOrder)) {
			System.out.print("Item:" + itemOrder + " is " + itemPrice + "$");
		} else {
			System.out.println("Invalid Item");
		}
	} // end of inputItem

	public static boolean checkItem(int item) {
		for (int i = 0; i < validValues.length; i++) {
			if (item == validValues[i]) {
				validItem = true;
				itemPrice = price[i];
			}

		} // end for
		return validItem;
	} // end of checkItem

}
