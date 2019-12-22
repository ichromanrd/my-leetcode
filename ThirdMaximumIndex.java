/**
Problem: https://leetcode.com/problems/third-maximum-number
*/

public class ThirdMaximumIndex {
	public static void main(String[] args) {
		int[] input = {4,4,2,2};
		System.out.println("Output: " + thirdMax(input));
	}
	
	public static int thirdMax(int[] nums) {
		int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for (int ii = 0; ii < nums.length; ii++) {
			max = max < nums[ii] ? nums[ii] : max;
			min = min > nums[ii] ? nums[ii] : min;
		}
		
		for (int ii = 0; ii < nums.length; ii++) {
			int c = nums[ii];
			if (c == max)
				continue;
			if (c > max2) 
				max2 = c > min && c < max ? c : max2;
		}
		
		for (int ii = 0; ii < nums.length; ii++) {
			int c = nums[ii];
			if (c >= max2)
				continue;
			if (c > max3)
				max3 = c;
		}
		
		return max > max2 && max2 > max3 ? max3 : max;
	}
}