package leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElement_169 {
	
	public int majorityElement(int[] nums) {
	    Map<Integer, AtomicInteger> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        if (null == map.get(nums[i])) {
	            map.put(nums[i], new AtomicInteger(1));
	        } else {
	            map.get(nums[i]).incrementAndGet();
	        }
	        if (map.get(nums[i]).get() > nums.length / 2) {
	            return nums[i];
	        }
	    }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
