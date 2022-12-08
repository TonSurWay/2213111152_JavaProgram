import javax.swing.*;

public class Lab_502 {
	static String email;
	public static void main(String[] args) {
		inputEmail();
		
	}
	
	public static void inputEmail() {
		String inputAgain = "";
		do {
			email = JOptionPane.showInputDialog("Input your e-mail: ");
			checkEmailError(email);
			 inputAgain = JOptionPane.showInputDialog("Contiunue[y||Y to continue]");
		
		}
		 while(inputAgain.equalsIgnoreCase("y")); 
			
			
	} // end of inputEmail Method
	public static void checkEmailError(String checkmail) {
		while (checkmail.startsWith("@") || checkmail.contains(" ")) {
			checkmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
		
		}
		boolean email = checkmail.endsWith("@gmail.com") || checkmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				checkEmail(checkmail) ? "Your e-mail is " + checkmail : 
					"Your e=mail is not hotmail or gmail dot com");

	}
	public static boolean checkEmail(String checkmail) {
		if(checkmail.endsWith("@gmail.com")||checkmail.endsWith("@hotmail.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
