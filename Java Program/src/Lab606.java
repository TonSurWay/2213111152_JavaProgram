import javax.swing.*;

public class Lab606 {
	 
	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(checkIndex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		}
		String prevData = (prevData(nums,index)!=-1)?"Previous data, nums["+(index-1)+"] is "+prevData(nums,index):"No previous data";
		String nextData = (nextData(nums,index)!=-1)?"Next data, nums["+(index+1)+"] is "+nextData(nums,index):"No next data";
		JOptionPane.showMessageDialog(null, "Current data,nums["+index+"] is "+currentData(nums,index)+"\n"+prevData+"\n"+nextData);
		
	}
	public static boolean checkIndex(int[] nums,int index) {
		
		return index< 0 || index>nums.length-1;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return index ==0?-1:nums[index-1];
	}
public static int nextData(int[] nums, int index) {
	return index== nums.length-1?-1:nums[index+1];
}
}
