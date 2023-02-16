import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example_1201 {
	public static void main(String[] args) throws IOException {
		// Read data from file by Scanner class
		Scanner read = new Scanner(new File("MemberLogin.txt"));

		while (read.hasNext()) {

			String name = read.next();
			read.next();
			read.next();
			String email = read.next().toUpperCase();
			System.out.println(name + " (" + email + ") ");
		}
		read.close();
	}
}
