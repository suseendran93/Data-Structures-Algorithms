package sorting;

import java.util.Arrays;

public class MergeSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 5, 4, 6, 1, 8 };
		System.out.println(Arrays.toString(mergeSort(array)));
	}

	static int[] mergeSort(int[] lst) {
		int n = lst.length;

		if (n > 1) {
			// create space for left and right subarrays
			int[] left;
			int[] right;
			if (n % 2 == 0) {
				left = new int[n / 2];
				right = new int[n / 2];
			} else {
				left = new int[n / 2];
				right = new int[n / 2 + 1];
			}

			// fill up left and right subarrays
			for (int i = 0; i < n; i++) {
				if (i < n / 2) {
					left[i] = lst[i];
				} else {
					right[i - n / 2] = lst[i];
				}
			}

			// recursively split and merge
			left = mergeSort(left);
			right = mergeSort(right);

			// merge
			return merge(left, right);
		}

		else
			return lst;
	}

	// the function for merging two sorted arrays
	static int[] merge(int[] left, int[] right) {
		// create space for the merged array
		int[] result = new int[left.length + right.length];

		// running indices
		int i = 0;
		int j = 0;
		int index = 0;

		// add until one subarray is deplete
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				result[index++] = left[i++];
			} else {
				result[index++] = right[j++];
			}
		}

		// add every leftover elelment from the subarray
		while (i < left.length) {
			result[index++] = left[i++];
		}

		// only one of these two while loops will be executed
		while (j < right.length) {
			result[index++] = right[j++];
		}

		return result;
	}

}
