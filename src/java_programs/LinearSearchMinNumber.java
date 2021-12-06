package java_programs;

public class LinearSearchMinNumber {

	public static void main(String[] args) {

		int[] arr = { 12, 10, 3, 18, -7, 2 };
		
		System.out.println(min(arr));
		System.out.println(max(arr));
		System.out.println(minRange(arr, 2, 4));
	}

	private static int minRange(int[] arr, int start, int end) {
		
		int min = arr[0];
		for (int i = start; i <=end; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}
