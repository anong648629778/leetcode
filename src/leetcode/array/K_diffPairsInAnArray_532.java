package leetcode.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class K_diffPairsInAnArray_532 {

    public int findPairs(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, Integer> memoryMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null == memoryMap.get(nums[i])) {
                memoryMap.put(nums[i], 1);
            } else {
                memoryMap.put(nums[i], memoryMap.get(nums[i]) + 1);
            }
        }
        Iterator<Integer> it = memoryMap.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            if (k == 0 && memoryMap.get(key) > 1
                    || k > 0 && memoryMap.containsKey(key + k)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
       System.out.println(new K_diffPairsInAnArray_532().findPairs(new int[] {3,1,4,1,5}, 0));
    }

}
