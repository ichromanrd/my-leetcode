public class NonDecreasingArray {
	public static void main(String[] args) {
		int[] nums = {4,2,3};
		//int[] nums = {4,2,1};
		//int[] nums = {3,4,2,3};
		
		/*
		Example: {4,2,3} is acceptable
				 {4,2,1} is not acceptable
		*/
		
		System.out.println("result: " + checkPossibility(nums));
	}
	
	public static boolean checkPossibility(int[] nums) {
		int mod = 0;
		for(int ii = 0; ii < nums.length - 1; ii++) {
			int c = nums[ii];
			int next = nums[ii + 1];
			if (c > next) {
				mod++;
				if (ii > 0) {
					int p = nums[ii - 1];
					if (p > next) nums[ii + 1] = c;
					else nums[ii] = next;
				} else nums[ii] = next;
			}
			
		}
		return mod <= 1;	
	}
}