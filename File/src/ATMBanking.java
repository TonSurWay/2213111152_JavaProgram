import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class ATMBanking {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		ATMChecking chek = new ATMChecking(null, null, 0);
		DecimalFormat frm = new DecimalFormat("0-000-000-00-0");
		
		System.out.print("Enter account number : ");
		String acc = console.next();
		while(acc != frm.format(acc) && acc.equals(Integer.parseInt(acc))) {
			System.out.print("Input wrong type, Enter account number : ");
			acc = console.next();
		}
	}
}
