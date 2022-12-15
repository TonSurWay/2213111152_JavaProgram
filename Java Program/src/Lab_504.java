import java.util.*;

public class Lab_504 {
	static String fullname;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		fullname = scan.nextLine();
		String firstname = fullname.substring(0,fullname.indexOf(' '));
		System.out.print(abbreviatName(fullname)+firstname);

	}

	public static String abbreviatName(String fullname) {
		String lastname="";
		for (int i = 0; i < fullname.length(); i++) {
			if (fullname.charAt(i) == ' ') {

				lastname+=fullname.charAt(i + 1) + ".";

			}
		}

		return lastname;
	}

}
