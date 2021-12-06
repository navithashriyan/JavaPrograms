package java_programs;

public class LinearSearchInRange {

	public static void main(String[] args) {
		// search element in array from range say 2 to 6

		int[] arr = { 2, 3, 4, 5, 6, 7 };
		int target = 5;
		int start = 6;
		int end = 2;
		int index = linearSearchRange(arr, target, start, end);

		System.out.println("Element " + target + " found at index " + index);
	}

	private static int linearSearchRange(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		if (start > end) {
			System.out.println("incorrect range");
			return -1;
		}

		for (int i = start; i < end; i++) {

			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

}
