import java.io.BufferedReader;
import java.io.*;



public class ATMChecking extends ATMData {
	private int money;
	
	public ATMChecking (String acc, String pass, int money) {
		super(acc, pass);
		this.money = money;
	}
	public boolean checkBookBank() throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		return false;
		String temp = "";
		while((temp = read.readLine()) != null){
			String[] data = temp.split("\t");
		
			
		}
	}
	public void show() {
		
	}
}
