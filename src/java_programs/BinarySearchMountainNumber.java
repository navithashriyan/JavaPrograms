package java_programs;

import java.util.Arrays;

public class BinarySearchMountainNumber {

	public static void main(String[] args) {
	int[] arr = {2, 3, 4, 7, 10, 9, 4, 3, 1};
	System.out.println(mountainNumberSearch(arr));

	}

	public static int mountainNumberSearch(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else if (arr[mid] > arr[mid + 1]) {
				end = mid;
			}

		}

		return arr[start];
	}

}
