import java.util.*;
import java.io.*;

public class EmployeeInfo {
	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		String choice;
		String department;
		System.out.print("Insert pr Read data(from file) : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please text insert or read data?: ");
			choice = console.next().toLowerCase();
		}
		//Create object to call SaveandOpen class
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}
		else {
			System.out.print("\nEnter department: ");
			department = console.next();
			file.setDept(department); // send department to setDept() method from Employee Class
			file.read(); // Call read Method from SaveandOpen Class
		}
	}
}
