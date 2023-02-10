package sample;

import java.util.HashMap;

/*
 * array = 1, 15, 8, 13, 5
 * 
 * x = 28
 * 
 * {}(28), {5}(23)
 * 
 * {}, {13}(15), {5}(23), {5, 13}(10)
 * 
 * {}, {8}, {13}, {13, 8}, {5}, {5, 8}, {5, 13}, {5, 13, 8}
 *        
 * {}, {15}, {8}, {8, 15}, {13}, {13, 15}  ......
 */
public class FindNumberSetSum {

	public static void main(String[] args) {
		int[] array = {1, 15, 8, 13, 5};
		HashMap<String, Integer> cache = new HashMap<>();
		System.out.println(countMatchingSets(array, 28, array.length -1, cache));
		
		
		
	}
	
	public static int countMatchingSets(int [] array, int reminder, int index, HashMap<String, Integer> cache) {
		if (reminder == 0) {
			return 1;
		}
		if (reminder < 0) {
			return 0;
		}
		if (index < 0) {
			return 0;
		}
		String key = reminder + ":" + index;
		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		if (array[index] > reminder) {
			int result = countMatchingSets(array, reminder, index -1, cache);
			cache.put(key, result);
			return result;
		}
		int result =  countMatchingSets(array, reminder, index -1, cache) 
				+ countMatchingSets(array, reminder - array[index], index -1, cache);
		cache.put(key, result);
		return result;
		
		
	}
	

	
	
}

