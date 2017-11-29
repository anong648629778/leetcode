package leetcode.array;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers_628 {

	 public int maximumProduct(int[] nums) {
		 Arrays.sort(nums);
		 int len = nums.length;
		 return Math.max(nums[len - 1] * nums[1] * nums[0], nums[len - 1] * nums[len - 2] * nums[len - 3]);
	 }
	 
	public static void main(String[] args) {
		System.out.println(new MaximumProductOfThreeNumbers_628().maximumProduct(new int[] {-4,-3,-2,-1,60}));
	}

}
