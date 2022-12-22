import java.util.*;

public class Lab_03 {

	public static void main(String[] args) {
		String Word ="";
		String Text ="";
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Word: ");
			Word = sc.nextLine();
			if(Word.equalsIgnoreCase("stop")) {
				break;
			}
	Text = Text + Word + " ";
		}
		System.out.print(Text.toUpperCase());
	}
}
