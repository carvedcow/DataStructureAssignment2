package Main;

import Model.Task1;
import Model.Task2;
import Model.Task3;

public class Main {
	public static void main(String[] args) {

		// Task 1 --------------------------------------------

		//Given an array of ints of even length, 
		//return a new array length 2 containing the 
		//middle two elements from the original array.
		//The original array will be length 2 or more.

		//makeMiddle([1, 2, 3, 4]) ? [2, 3]
		//makeMiddle([7, 1, 2, 3, 4, 9]) ? [2, 3]
		//makeMiddle([1, 2]) ? [1, 2]

		// Values
		System.out.println("--- Task 1 ---");
		Task1 task1 = new Task1();
		int[] task1Array1 = new int[] {1, 2, 3, 4};
		int[] task1Array2 = new int[] {7, 1, 2, 3, 4, 9};
		int[] task1Array3 = new int[] {1, 2};

		// Change the input array to test each array vvvvvv
		int[] arrayToTest1 = task1.getMiddleArray(task1Array1);

		// Methods
		if (arrayToTest1.length == 2) {
			for (int i = 0; i < arrayToTest1.length ; i++) {
				System.out.println("index_" + i + ": " + arrayToTest1[i]);
			}
		}

		else 
			System.out.println("Error. Your array is not even.");

		System.out.println();

		// Task 2 --------------------------------------------

		//Return an array that is shifted to left by one 
		//-- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
		//You may modify and return the given array, 
		//or return a new array.

		//fun([6, 2, 5, 3]) ? [2, 5, 3, 6]
		//fun([1, 2]) ? [2, 1]
		//fun([1]) ? [1]

		System.out.println("--- Task 2 ---");
		// Values
		Task2 task2 = new Task2();
		int[] task2Array1 = new int[] {6, 2, 5, 3};
		int[] task2Array2 = new int[] {1, 2};
		int[] task2Array3 = new int[] {1};

		// Change the input array to test each array vvvvvv
		int[] arrayToTest2 = task2.shiftArray(task2Array1);

		// Methods
		for (int i = 0; i < arrayToTest2.length ; i++) {
			System.out.println("index_" + i + ": " + arrayToTest2[i]);
		}

		System.out.println();

		// Task 3 --------------------------------------------

		//Given 2 int arrays, a and b, each length 3, 
		//return a new array length 2 containing their middle elements.

		//middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
		//middleWay([7, 7, 7], [3, 8, 0]) ? [7, 8]
		//middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]

		System.out.println("--- Task 3 ---");
		// Values
		Task3 task3 = new Task3();
		int[][] task3Array1 = new int[][] {{1, 2, 3}, {4, 5, 6}};
		int[][] task3Array2 = new int[][] {{7, 7, 7}, {3, 8, 0}};
		int[][] task3Array3 = new int[][] {{5, 2, 9}, {1, 4, 5}};

		// Change the input array to test each array vvvvvv          vvvvvv
		int[] arrayToTest3 = task3.getMiddleValues(task3Array1[0], task3Array1[1]);

		// Methods
		for (int i = 0; i < arrayToTest3.length ; i++) {
			System.out.println("index_" + i + ": " + arrayToTest3[i]);
		}

		System.out.println();
	}
}
