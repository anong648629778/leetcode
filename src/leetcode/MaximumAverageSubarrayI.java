package leetcode;

/**
 * ��Ŀ���⣺�������k���������ƽ����
 * ���⣺ʹ��sum[i]��� (i - k) �� i����k�����ĺͣ�ȡ�����ĺ���ƽ����
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
