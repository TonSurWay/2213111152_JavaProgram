import java.util.*;

public class Lab603 {
	static Scanner sc = new Scanner(System.in);
	static int[] numberofInteger = { 78, 36, 58, 41, 25, 92, 75 };

	public static void main(String[] args) {
		System.out.print("Input index of array : ");
		int indexofArray = sc.nextInt();
		while(indexofArray < 0 || indexofArray > (numberofInteger.length-1)) {
			System.out.print("Input index of array, again : ");
			indexofArray = sc.nextInt();
		}
		System.out.println();
		System.out.println("value in cuurent index is "+(numberofInteger[indexofArray]));
		//System.out.println("value in next index is "+(numberofInteger[indexofArray]));
	if(indexofArray == 6) {
		System.out.print("Sorry, "+indexofArray + " is the last index in array.");
	}
	else {
		System.out.println("value in next    index is "+(numberofInteger[indexofArray+1]));
	}
	}

}
