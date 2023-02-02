import java.util.Scanner;

public class MovieDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input movie id : ");
		String id = sc.nextLine();
		System.out.print("Input movie name : ");
		String name = sc.nextLine();

		System.out.println();

		System.out.print("Input director name : ");
		String direcname = sc.nextLine();
		System.out.print("Input director e-mail : ");
		String email = sc.nextLine();

		char Direcgender = ' ';
		System.out.print("Input director gender : ");
		Direcgender = sc.nextLine().charAt(0);
	
		while (Direcgender != 'M' && Direcgender != 'F') {
			System.out.print("Input director gender, again : ");
			String gender = sc.nextLine();
			if (gender.equalsIgnoreCase("M")) {
				Direcgender = 'M';
			} else if (gender.equalsIgnoreCase("F")) {
				Direcgender = 'F';
			}
			
		}
		System.out.println();
		
		
		System.out.print("Input movie theater no. : ");
		int theater = sc.nextInt();
		while(theater <1 || theater > 15) {
			System.out.print("Please input 1 -15 only : ");
			theater = sc.nextInt();
		}
		Theater Theater = new Theater(id , name, new Director(direcname, email, Direcgender), theater);
		System.out.println(Theater);
	}
}
