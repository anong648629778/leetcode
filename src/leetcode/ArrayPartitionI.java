package leetcode;

import java.util.Arrays;

/**
 * 题目大意：有长度为2n的数组，怎么样组合(a1,b1),(a2,b2)...(ai,bi)才能让min(a1,b1) + min(a2, b2) +...+min(ai,bi)的和最大
 * 解题思路:让小的数，跟大于它的最小数组合，就是正解
 * @author haidong.huang
 *
 */
public class ArrayPartitionI {
	
	public static int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i+=2) {
			sum += nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(arrayPairSum(new int[]{1,3,2,4}));
	}
}
