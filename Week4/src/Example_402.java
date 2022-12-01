import javax.swing.*;

public class Example_402 {

	public static void main(String[] args) {

		String Inputemail = JOptionPane.showInputDialog("Input your e-mail");
		while (Inputemail.startsWith("@") || Inputemail.contains(" ")) {
			Inputemail = JOptionPane.showInputDialog("Input your e-mail");

		}
		Inputemail = Inputemail.toLowerCase();
		/*
		 * if(Inputemail.endsWith("@gmail.com")||Inputemail.endsWith("@hotmail.com")) {
		 * JOptionPane.showMessageDialog(null, "Your e-mail is "+Inputemail); } else {
		 * JOptionPane.showMessageDialog (null,
		 * "Your e-mail is not hotmail or gmail dot com "); }
		 */
		boolean checkEmail = Inputemail.endsWith("@gmail.com") || Inputemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail) ? "Your e-mail is " + Inputemail : "Your e=mail is not hotmail or gmail dot com");

	}

}
