package java_programs;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -18, -12, -2, 0, 10, 12, 14, 16, 18, 20, 25, 27, 35, 38, 50 };
		int target = -18;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}

	private static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			}
			if (arr[mid] == target) {
				return mid;
			}
		}
		return -1;
	}
}
