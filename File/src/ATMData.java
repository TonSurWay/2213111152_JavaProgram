
public class ATMData {
	private String accountNumber;
	private String password;

	public ATMData(String num, String pass) {
		accountNumber = num;
		password = pass;
	}

	public String getID() {
		return accountNumber;
	}

	public String getPass() {
		return password;
	}
}
