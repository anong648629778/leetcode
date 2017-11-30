package leetcode.array;

public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || i > 0 && nums[i] > target && nums[i - 1] < target
                    || i == 0 && nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {

    }
}
