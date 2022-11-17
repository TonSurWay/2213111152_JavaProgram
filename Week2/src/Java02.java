import java.util.*;

public class Java02 {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");
		int minutes = scan.nextInt();
        int mins = minutes / 60;
        int day = mins / 24;
        int year = day / 365;
        int days = day % 365;
        System.out.println(minutes +" minutes is approximately "+ year +" years and " + days + " days "  );
        
	}

}
