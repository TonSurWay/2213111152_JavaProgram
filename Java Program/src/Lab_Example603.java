import java.util.*;
public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for(int i = 0;i< number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = sc.nextInt();
		}
		System.out.println();
		int totalNumber = sumofPos(number);
		System.out.println("Summation of positive number is "+totalNumber);
	}//end of Main
	public static int sumofPos(int[] num) {
		int sum = 0;
		for(int _num:num) {
			sum+=_num;
		}
		return sum;
		
	}//end of sumofPos()

}
