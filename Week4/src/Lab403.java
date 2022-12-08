import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		String check = Message.toLowerCase();
		int index = 0;
		 
			if(Message.toLowerCase().indexOf("nichi")>=0) {
				index++;
			}
		
		if(index==1) {
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(Message);
		}
		
	}

}
