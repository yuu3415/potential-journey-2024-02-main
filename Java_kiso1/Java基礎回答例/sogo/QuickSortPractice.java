package sogo;

public class QuickSortPractice {

	static void quickSort(int[] arr, int left, int right) {

		if (left > right) {
			return;
		}

		int mid = left + (right - left) / 2;
		int pivot = arr[mid];
		int i = left;
		int j = right;

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

		if (left < j) {
			quickSort(arr, left, j);
		}

		if (right > i) {
			quickSort(arr, i, right);

		}
	}

	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1, };
		System.out.println("InitialArray:");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("SortedArray:");
		printArray(arr);
	}
}
