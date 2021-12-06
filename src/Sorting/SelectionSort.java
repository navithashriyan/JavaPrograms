package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 6, 4 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int e = arr.length - i - 1;
			int maxIndex = getMaxElement(arr, 0, e);
			swap(arr, maxIndex, e);
		}
	}

	static void swap(int[] arr, int maxIndex, int e) {
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[e];
		arr[e] = temp;
	}

	static int getMaxElement(int[] arr, int start, int end) {
		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
}
