package leetcode.array;

public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {
        for (int i = 0, k = 0; i < nums.length && k < nums.length; i++) {
            k = k < i ? i : k;
            if (nums[i] == 0) {
                while (k < nums.length) {
                    if (nums[k] != 0) {
                        int temp = nums[k];
                        nums[k] = 0;
                        nums[i] = temp;
                        break;
                    }
                    k++;
                }
            }
        }
    }

    public static void main(String[] args) {
        new MoveZeroes_283().moveZeroes(new int[] {1,0});
    }

}
