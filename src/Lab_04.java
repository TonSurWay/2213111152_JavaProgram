import javax.swing.*;

public class Lab_04 {

	public static void main(String[] args) {
		String email;
		email =JOptionPane.showInputDialog("Input your e-mail:");
		while(email.startsWith("@") || email.contains(" ")) {
			JOptionPane.showInputDialog("Input your e-mail:");
		}
	email = email.toLowerCase();
		
		boolean chekemail = (email.endsWith("@hotmail.com")||(email.endsWith("@gmail.com")));
		
			JOptionPane.showMessageDialog(null,(chekemail)? 
					"Your e-mail is "+email : "Your email is not hotnail "
							+ "or gmail dot com");
			
			
		
	}
}
