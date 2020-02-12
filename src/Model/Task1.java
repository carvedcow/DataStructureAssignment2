package Model;

//1-
//Given an array of ints of even length, 
//return a new array length 2 containing the 
//middle two elements from the original array.
//The original array will be length 2 or more.
//
//makeMiddle([1, 2, 3, 4]) ? [2, 3]
//makeMiddle([7, 1, 2, 3, 4, 9]) ? [2, 3]
//makeMiddle([1, 2]) ? [1, 2]

public class Task1 {
	public int[] getMiddleArray(int[] arr) {

		if (arr.length % 2 == 0) {
			int[] result = new int[2];
			result[0] = arr[arr.length/2 - 1];
			result[1] = arr[(arr.length/2)];
			return result;
		}
		
		else {
			return arr;
		}
	}
}
