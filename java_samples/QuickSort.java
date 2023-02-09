package sample;

import java.util.Arrays;

/*
 * array : 1, 10, 8, 3, 5, 2, 7
 * 
 * Partition 0
 * pivotIndex : 6, value 7
 * start = 0
 * smallerThanPivot = start - 1 : -1
 * counter = start : 0
 * 
 * Iteration 1:
 * smallerThanPivot = smallerThanPivot  +1 : 0
 * swap(array, smallerThanPivot, counter)
 * counter = counter + 1: 1
 * 
 * Iteration 2:
 * counter = counter + 1 : 2
 * 
 * Iteration 3:
 * counter = counter + 1 : 3
 * 
 * Iteration 4: 
 * smallerThanPivot = smallerThanPivot  +1 : 1
 * swap(array, smallerThanPivot, counter): 1, 3, 8, 10, 5, 2, 7
 * counter = counter + 1 : 4
 * 
 * Iteration 5:
 * smallerThanPivot = smallerThanPivot  +1 : 2
 * swap(array, smallerThanPivot, counter): 1, 3, 5, 10, 8, 2, 7
 * counter = counter + 1 : 5
 * 
 * Iteration 6:
 * smallerThanPivot = smallerThanPivot  +1 : 2
 * swap(array, smallerThanPivot, counter): 1, 3, 5, 2, 8, 10, 7
 * counter = counter + 1 : 6
 * 
 * swap(array, smallerThanPivot + 1, counter): 1, 3, 5, 2, 7, 10, 8
 * return smallerThanPivot + 1
 */


public class QuickSort {
    
	public static void main(String[] args) {
		int[] array = {1, 10, 8, 3, 5, 2, 7};
		quickSort(array, 0, array.length -1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void quickSort(int[] array, int start, int end) {
		
		if (start < end) {
			int pivotIndex = partitionArray(array, start, end);
			quickSort(array, start, pivotIndex -1);
			quickSort(array, pivotIndex + 1, end);
		}
	}
	
	public static int partitionArray(int[] array, int start, int end) {
		int pivotIndex = end;
		int smallerThanPivot = start - 1;
		
		for(int counter = start; counter < pivotIndex; counter++) {
			if (array[counter] < array[pivotIndex]) {
				smallerThanPivot++;
				swap(array, smallerThanPivot, counter);
			}
		}
		
		swap(array, smallerThanPivot + 1, pivotIndex);
		return smallerThanPivot + 1;
		
	}
	
	public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
	}
   

}


