package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 9, 7, 5 };
		bubble(array);
	}

	public static void bubble(int[] array) {
		boolean swapped;
		int temp = 0;

		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}

			}

		} while (swapped == true);
		System.out.println(Arrays.toString(array));

	}

}
