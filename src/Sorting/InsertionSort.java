package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 6, 7, 3 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}

			}

		}
	}

	static void swap(int[] arr, int maxIndex, int e) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[e];
		arr[e] = temp;
	}
}
