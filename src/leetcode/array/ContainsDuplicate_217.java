package leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
	
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> memory = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!memory.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
