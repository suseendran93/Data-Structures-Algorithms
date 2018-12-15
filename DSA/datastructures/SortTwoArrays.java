package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = { 1, 5, 2, 6, 7, 3, 9, 7, 4 };
		//sortArray(array);
		
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2;
		l2 = new ArrayList<>(Arrays.asList(array));
		
		List<Integer> l3=l2;
		List<Integer> l4=new ArrayList<>(l2);
		// ArrayList<Integer> evenArray = new ArrayList<>();
		// ArrayList<Integer> oddArray = new ArrayList<>();

		// Arrays.sort(array);

		// for (int i = 0; i < array.length; i++) {
		// if (array[i] % 2 == 0) {
		// evenArray.add(array[i]);
		// } else
		// oddArray.add(array[i]);
		// }
		// for (int i : evenArray)
		// System.out.print(i + " ");
		//
		// for (int i : oddArray)
		// System.out.print(i + " ");
		//
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}

			}
		}

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}
}