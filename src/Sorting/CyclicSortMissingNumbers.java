package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortMissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 3, 0, 1, 6 };
		missingNumbers(arr);
	}

	static void missingNumbers(int[] arr) {
		cyclicSort(arr);
		// System.out.print(Arrays.toString(arr));
		List<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				arrList.add(i + 1);
			}
		}
	}

	static void cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
