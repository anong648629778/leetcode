package leetcode;

import java.util.Arrays;

/**
 * ��Ŀ���⣺�г���Ϊ2n�����飬��ô�����(a1,b1),(a2,b2)...(ai,bi)������min(a1,b1) + min(a2, b2) +...+min(ai,bi)�ĺ����
 * ����˼·:��С������������������С����ϣ���������
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
