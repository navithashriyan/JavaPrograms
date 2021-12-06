package Sorting;

import java.util.Arrays;

public class CyclicSort {
	//numbers in the form of 1 to n , so find correct index of the number to be placed

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 3, 1, 6 };
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void cyclicSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
			i++;
		}}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
