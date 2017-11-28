package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray_697 {

    class Num {
        int count;
        int start;
        int end;

        public Num(int count, int start, int end) {
            super();
            this.count = count;
            this.start = start;
            this.end = end;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public void increaseCount() {
            this.count++;
        }

        public int getDistance() {
            return this.end - this.start;
        }
    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Num> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Num tempNum = map.get(nums[i]);
            if (null == tempNum) {
                map.put(nums[i], new Num(1, i, i));
            } else {
                tempNum.increaseCount();
                tempNum.setEnd(i);
            }
        }
        int maxCount = 0;
        int maxKey = 0;
        for (Integer key : map.keySet()) {
            if (maxCount < map.get(key).getCount() || maxCount == map.get(key).getCount()
                    && map.get(key).getDistance() < map.get(maxKey).getDistance()) {
                maxCount = map.get(key).getCount();
                maxKey = key;
            }
        }
        return map.get(maxKey).getDistance() + 1;
    }

    public static void main(String[] args) {
        System.out
                .println(new DegreeOfAnArray_697().findShortestSubArray(new int[] {1, 2, 2, 3, 1}));
    }

}
