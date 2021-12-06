package Sorting;

public class CyclicSortMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3 };
		int mn= missingNumber(arr);
		System.out.println(mn);
		
	}



	static int missingNumber(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i]<arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		for (int j=0; j< arr.length; j++){
			if(arr[j] != j) {
				return j;
			}
		}
		return arr.length;
		
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
