package sample;
/*
 * sorted_arry = 1, 3, 5, 7, 10, 12, 15, 19
 * 
 * x = 12
 * start = 0
 * end = 7
 * 
 * Iteration 1
 * mid = start  + (end - start )/2 : 3
 * start = mid + 1 : 4
 * end : 7
 * 
 * Iternation 2
 * mid = start  + (end - start )/2 : 5
 * 
 * x = 4
 * Iteration 1
 * mid = start  + (end - start )/2 : 3
 * start = 0
 * end : mid -1 : 2
 * 
 * Iteration 2
 * mid = start  + (end - start )/2 : 1
 * start : mid + 1 : 2
 * end : 2
 * 
 * Iteration 3: 
 * mid = start  + (end - start )/2 : 2
 * start = 2
 * end = mid -1 : 1
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		int [] sorted_array = {1, 3, 5, 7, 10, 12, 15, 19};
		System.out.println(binarySearch(sorted_array, 12));
		System.out.println(binarySearch(sorted_array, 4));
	}
	
	public static Boolean binarySearch(int[] sorted_array, int x) {
		int start = 0;
		int end = sorted_array.length - 1;
		int mid = 0;
		while(start <= end) {
			mid = start + (end -start)/2;
			if (sorted_array[mid] == x) {
				return true;
			} else if (sorted_array[mid] < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

}
