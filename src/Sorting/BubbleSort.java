package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 5 };
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void bubbleSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			boolean swapped = false;
			for (int j = 1; j < a.length - i; j++) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				System.out.println("Arrays sorted");
				break;
			}
		}
	}
}
