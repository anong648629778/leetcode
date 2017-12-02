package leetcode.array;

/**
 * 题目大意：大概就是给一个由0，1组成的数据，这些数字有两种组成方式，一种是单单由0组成，一种是有10
 * 或者11这样的形式组成，问是不是最后一种组成一定会是0 解题思路：
 * 
 * @author huanghaidong
 *
 */
public class OneBitAndTwoBitCharacters_717 {

	public static boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		while(i < bits.length) {
			if (i == bits.length - 1) {
				return true;
			}
			if (bits[i] == 1) {
				i++;
			}
			i++;
		}
		return false;
    }

	public static void main(String[] args) {
		System.out.println(isOneBitCharacter(new int[] { 1,0,0 }));
	}
}
