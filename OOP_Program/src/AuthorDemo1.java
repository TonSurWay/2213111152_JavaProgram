import java.util.Scanner;

public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input author name   : ");
		String name = sc.nextLine();
		System.out.print("Input author e-mail : ");
		String email = sc.nextLine();
		System.out.print("Input author gender : ");
		char gender = sc.nextLine().charAt(0);
		
		Author author = new Author(name, email , gender);
		System.out.println();
		System.out.println(author.toString());

	}

}
