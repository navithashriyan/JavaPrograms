package java_programs;

public class BinarySearchCeilingNumber {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 14, 17, 18, 19, 20, 22, 23, 25, 35 };
		int target = 36;
		int ans = ceilingNumber(arr, target);
		System.out.println(ans);
	//	System.out.println(arr[ans]);
	}

//ceilingNumber = smallest number >= target
	private static int ceilingNumber(int[] arr, int target) {
		if (target > arr.length - 1) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
		}
		return start;
	}
}
