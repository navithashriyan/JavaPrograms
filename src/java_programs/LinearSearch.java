package java_programs;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 12, 10, 10, 6, 9 };
		int target = 19;
		int index = linearSearch(arr, target);
		System.out.println("Element found at index " + index);
	}

	private static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}

}
