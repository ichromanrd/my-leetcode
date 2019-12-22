/**
Problem: https://leetcode.com/problems/third-maximum-number
*/

public class ThirdMaximumIndex {
	public static void main(String[] args) {
		int[] input = {4,4,2,2};
		System.out.println("Output: " + thirdMax(input));
	}
	
	public static int thirdMax(int[] nums) {
		// define default max and min values
		int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		// find the max and min value of these array
		for (int ii = 0; ii < nums.length; ii++) {
			max = max < nums[ii] ? nums[ii] : max;
			min = min > nums[ii] ? nums[ii] : min;
		}
		
		// find the second max
		for (int ii = 0; ii < nums.length; ii++) {
			int c = nums[ii];
			if (c < max && c > max2) 
				max2 = c > min && c < max ? c : max2;
		}
		
		// find the third max
		for (int ii = 0; ii < nums.length; ii++) {
			int c = nums[ii];
			if (c < max2 && c > max3)
				max3 = c;
		}
		
		// assert if max2 and max3 sequentially lesser than previous max, if true then return max3 or return max instead
		return max > max2 && max2 > max3 ? max3 : max;
	}
}