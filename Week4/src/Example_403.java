import java.util.*;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.print("Input a sentence: "); String Sentence = scan.nextLine();
		 * while (!Sentence.endsWith(".")) {
		 * System.out.print("Input a sentence,again: "); Sentence = scan.nextLine(); }
		 * System.out.println(); int spaceofWord = 0; for (int i = 0; i <
		 * Sentence.length(); i++) { if(Sentence.charAt(i)==' ') { spaceofWord++; } }
		 * System.out.println("This sentence has "+spaceofWord+ " spacebars.");
		 * System.out.println("This sentence has "+(spaceofWord+1)+ " words."); }
		 */
		String Sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while (!Sentence.endsWith(".")) {
			Sentence = JOptionPane.showInputDialog("Input a sentence: ");
		}
		System.out.println();
		int spaceofWord = 0;
		for (int i = 0; i < Sentence.length(); i++) {
			if (Sentence.charAt(i) == ' ') {
				spaceofWord++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has " + spaceofWord + " spacebars." + "\nThis sentence has "
				+ (spaceofWord + 1) + " word.");
	}
}
