package java_programs;

public class BinarySearchOrderAgnostic {

	public static void main(String[] args) {
		int[] arr = { -18, -12, -2, 0, 10, 12, 14, 16, 18, 20, 25, 27, 35, 38, 50 };
		//int[] arr = { 90, 34, 23, 12, 11, 10, 4, -1, -5 };
		int target = 25;
		int ans = binarySearchOrderAgno(arr, target);
		System.out.println(ans);
	}

	private static int binarySearchOrderAgno(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				}
			if (target < arr[mid]) {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
