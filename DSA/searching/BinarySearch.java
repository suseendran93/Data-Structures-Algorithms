package searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 5, 7, 9, 12, 15, 20 }; // Array should be sorted
		int n = 5;
		int low = 0;
		int high = array.length - 1;
		System.out.println(searchAlgorithm(array, n, low, high));
	}

	private static int searchAlgorithm(int[] array, int n, int low, int high) {

		if (low > high) {
			
			return -1;
		
		}
		int mid = (low + high) / 2;
		if(n==array[mid])
			return array[mid];
		
		else if (n < array[mid]) 
			return searchAlgorithm(array, n, low, mid - 1);
		
		 else
			return searchAlgorithm(array, n, mid + 1, high);
		 

		
	}

}
