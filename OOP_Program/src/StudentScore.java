import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int nums = sc.nextInt();
		System.out.println();
		Student[] std = new Student[nums]; // define Array of Object

		for (int i = 0; i < std.length; i++) {
			System.out.println("INPUT INFORMATION OF STUDENT " + (i + 1));
			Line();
			System.out.println();
		
			std[i] = new Student(); // declare Array object, call of method Student
			System.out.print("Input student name : ");
			std[i].setName(sc.next());
			System.out.print("Input student score : ");
			std[i].setScore(sc.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(sc.nextInt());
			} // end of while Loop()
			System.out.println();
		} // end of for Loop()

		/*
		 * System.out.println(); System.out.println("LIST OF PASS STUDENT (>=50)");
		 * System.out.println("----------------------------------");
		 * 
		 * 
		 * for (int i = 0; i < std.length; i++) { if (std[i].isPass()) {
		 * System.out.println(">> " + std[i].getName() + " (" + std[i].getScore() +
		 * ")"); } } // end of for()
		 */
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " get grade " + STD.findGrade(0));
			}
		}

	} // end of main method()
	public static void Line() {
		for(int i = 0;i<30;i++) {
			System.out.print("-");
		}
	}
}
