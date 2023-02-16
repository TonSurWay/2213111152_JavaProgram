import java.util.*;
import java.io.*;

public class SaveandOpen extends Employee {
	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintStream ps = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter dept : ");
			dept = input.next();
			// write all to file
			ps.println(name + "\t" + dept);
			System.out.print("Enter data again? : ");
			answer = input.next();

		} while (answer.equalsIgnoreCase("y"));

	}// insert() method

	public void read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println("("+i+")"+name);
					check = true;
				}
			}
			if(check) {
				super.header();
				System.out.print("\nEmployee in department "+super.getDept()+
						" is "+i+" person ");
				super.header();
			}else {
				System.out.print("\nSorry, no department: "+ super.getDept()+
						" in file.");
			}
			in.close();
		}
		catch(IOException e){
			System.out.print("\nSorry, File Not Found.");
		}

	}
}
