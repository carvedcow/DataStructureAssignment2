package Model;

//2-
//Return an array that is shifted to left by one 
//-- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
//You may modify and return the given array, 
//or return a new array.
//
//fun([6, 2, 5, 3]) ? [2, 5, 3, 6]
//fun([1, 2]) ? [2, 1]
//fun([1]) ? [1]

public class Task2 {
	
	public int[] shiftArray(int[] arr) {
		
		int firstIndex = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = firstIndex;
		
		return arr;
	}
}
