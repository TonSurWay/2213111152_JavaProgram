import java.util.Scanner;

public class BookDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();

		System.out.print("Input book title   : ");
		book.setTitle(sc.nextLine());
		System.out.print("Input book price   : ");
		book.setPrice(sc.nextFloat());
		System.out.print("Input publish year : ");
		book.setPublishYear(sc.nextInt());
		
		System.out.println(book.toString());
	}
}
