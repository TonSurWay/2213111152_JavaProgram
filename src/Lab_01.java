import java.util.*;

public class Lab_01 {

	public static void main(String[] args) {

		inputStudent();

	}

	public static void inputStudent() {
		String StudId = "";
		String SubId = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Student Id:");
			StudId = sc.nextLine();
			System.out.print("Enter Subject Id:");
			SubId = sc.nextLine();
		}

		while (!isLength(StudId, SubId));
		boolean x = isITStudent(StudId);
		boolean y = isITSubject(SubId);

		System.out.print(x + "" + y);
		System.out.print("student id: " + StudId + " is ");

		displayData(x, y);

	}// end of inputStudent

	public static boolean isLength(String StudId, String SubId) {
		if (StudId.length() == 10 && SubId.length() == 7) {
			return true;
		} else {

			return false;
		}
	}// end of isLength

	public static boolean isITStudent(String StudId) {

		if (StudId.substring(0, 6).equals("211311")) {

			return true;
		}

		else {
			return false;
		}

	}// end of isITStudent

	public static boolean isITSubject(String SubId) {

		if (SubId.substring(0, 2).equals("21") && SubId.substring(4, 5).equals("1")) {
			return true;
		} else {
			return false;
		}
	}// end of isITSubject

	public static void displayData(boolean x, boolean y) {
		if (x && y) {
			System.out.print(" 1st year student in IT and" + "\nEnroll in courses for Year 1");
		} else if (x && !y) {
			System.out.print(" 1st year student in IT" + "\nNot enroll in courses for Year 1");
		} else if (!x && y) {
			System.out.print(" not 1st year student in IT" + "\nEnroll in courses for Year 1");
		} else {
			System.out.print(" not 1st year student in IT" + "\nNot enroll in courses for Year 1");
		}
	}
}
