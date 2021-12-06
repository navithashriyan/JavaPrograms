package java_programs;

import java.util.Arrays;

public class ArrayP {

	public static void main(String[] args) {

		int[] arr = { 0, 4, 2, 3, 1 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	static int[] solution(int[] nums) {
		int n = nums.length;
		// System.out.println(n);
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = nums[nums[i]];
			// System.out.println(nums[nums[i]]);
		}
		return array;
	}
}
