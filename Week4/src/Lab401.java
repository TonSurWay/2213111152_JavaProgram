import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String Fullname,Firstname,Lastname;
		System.out.print("Input full name: ");
		Fullname = scan.nextLine();
		int space = Fullname.indexOf(' ');
		
		if(space==-1) {
			System.out.println("Incorrect Name");
			
		}
		else {
			Firstname=(Fullname.substring(0,Fullname.indexOf(" ")));
			Lastname=(Fullname.substring(Fullname.indexOf(" ")));
			System.out.println("First Name: "+Firstname.toUpperCase()+"\nLast Name : "+Lastname.toLowerCase());
		
		}
		
	}
}
