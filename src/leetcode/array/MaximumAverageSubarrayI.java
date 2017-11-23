package leetcode.array;

/**
 * 题目大意：求出连续k个数的最大平均数
 * 解题：使用sum[i]存放 (i - k) 至 i连续k个数的和，取出最大的和求平均数
 * @author huanghaidong
 *
 */
public class MaximumAverageSubarrayI {
	
	public static double findMaxAverage(int[] nums, int k) {
        long []sum = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
        	if (i > k - 1) {
        		sum[i] = sum[i-1] + nums[i] - nums[i - k];
        	} else {
        		if (i > 0) {
        			sum[i] = sum[i - 1] + nums[i];
        		} else {
        			sum[i] = nums[i];
        		}
        	}
        }
        long max = Long.MIN_VALUE;
        for (int i = k - 1; i < nums.length; i++) {
        	max = max < sum[i] ? sum[i] : max;
        }
        return max / (k * 1.0d);
    }

	public static void main(String[] args) {
		System.out.println(findMaxAverage(new int[]{-1}, 1));
	}
}
