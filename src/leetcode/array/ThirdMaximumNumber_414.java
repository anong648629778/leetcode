package leetcode.array;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ThirdMaximumNumber_414 {

	public int thirdMax(int[] nums) {
        Map<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
        	
		});
        for (int i = 0; i < nums.length; i++) {
        	treeMap.put(nums[i], nums[i]);
        }
        if (treeMap.size() < 3) {
        	return treeMap.keySet().iterator().next();
        } else {
        	Iterator<Integer> it = treeMap.keySet().iterator();
        	for (int i = 0; i < 2; i++) {
        		it.next();
        	}
        	return it.next();
        }
    }

	public static void main(String[] args) {
		System.out.println(new ThirdMaximumNumber_414().thirdMax(new int[] {3, 2, 1}));
	}

}
