import java.util.*;

public class Lab602 {
	static Scanner sc = new Scanner(System.in);
	static double sum = 0;
	static double averageNumber = 0;

	public static void main(String[] args) {
		double[] score = new double[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			score[i] = sc.nextDouble();
			sum += score[i];
		} // end of for
		System.out.println();
		averageNumber = sum / (score.length);
		System.out.println("Average of " + score.length + "student is " + averageNumber);
	for (int i = 0;i<score.length;i++) {
		if(score[i]> averageNumber) {
			System.out.println("> Student "+(i+1)+" ("+score[i]+")");
		}
	}
	}

}
