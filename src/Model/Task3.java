package Model;

//3-
//Given 2 int arrays, a and b, each length 3, 
//return a new array length 2 containing their middle elements.
//
//middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
//middleWay([7, 7, 7], [3, 8, 0]) ? [7, 8]
//middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]

public class Task3 {
	public int[] getMiddleValues(int[] arr1, int[] arr2) {
		int[] result = new int[2];
		result[0] = arr1[1];
		result[1] = arr2[1];
		
		return result;
	}
}
