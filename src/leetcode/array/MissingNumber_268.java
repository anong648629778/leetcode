package leetcode.array;

import java.util.Arrays;

public class MissingNumber_268 {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int last = -1;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] - last != 1) {
        		return nums[i] - 1;
        	}
        	last = nums[i];
        }
        return last + 1;
    }
}
