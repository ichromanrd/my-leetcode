public class MaximumSubarray {
	public static void main(String[] args) {
		int[] presum = {-2,-1,-4,0,-1,1,2,-3,1}; // 6
		int[] input = {-2,1,-3,4,-1,2,1,-5,4}; // 6
		int output = maxSubArray(input);
		System.out.println(output);
	}
	
	private static int maxSubArray(int[] nums) {
		int r = 0;
		for(int i = 0; i < nums.length; i++) {
			int tr = 0;
			for(int y = i; y < nums.length; y++) {
				tr += nums[y];
				r = (tr > r) ? tr : r;
			}
		}
		return r;
	}
}

	1 2 3 4  -2 1
	1 3 6 10 8  9