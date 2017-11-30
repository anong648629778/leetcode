package leetcode.array;

public class TwoSumIIInputArrayIsSorted_167 {
    
    public int[] twoSum(int[] numbers, int target) {
       for (int i = 0, k = numbers.length -1; i < k ;) {
           if (numbers[i] + numbers[k] == target) {
               return new int[] {i + 1, k + 1};
           }
           if (numbers[i] + numbers[k] < target) {
               i++;
           } else {
               k--;
           }
       }
       return new int[] {};
    }

    public static void main(String[] args) {
        new TwoSumIIInputArrayIsSorted_167().twoSum(new int[] {0, 0, 3, 4}, 0);
    }

}