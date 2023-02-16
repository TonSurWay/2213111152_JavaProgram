import java.util.*;
import java.io.*;

public class Example_1202 {
	static	Scanner input = new Scanner(System.in); // Input data from keyboard||console
	// read data from file by BufferedReader class
	public static void main(String[] args) throws IOException{
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		
	}
	public static void showListStudent(int sec) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String gradeResult = findResult(midtermScore, finalScore);
			if(Integer.parseInt(data[3]) == sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+
			midtermScore+"\t"+finalScore+"\t"+gradeResult);
			}
		}
		read.close();
	}
	public static String findResult(double mid, double fin) {
		double totalScore = mid+fin;
		if(totalScore <= 40) {
			return "Fail";
		}
		else return "Pass";
		
	}
	public static void Header(int sec) {
		System.out.println("*********************************************");
		System.out.println("\t\t\tList of Data for Section "+sec);
		System.out.println("*********************************************");

	}
}
