package kishore;

import java.util.Scanner;
/*
 * The Maximum and Minimum value of an array can also be found by sorting the array element
 * Arrays.sort(numberArray);
 * minimumValue = numberArray[0];
 * maximumValue = numberArray[numberArray.length - 1]
*/

public class MaximumAndMinimumElementInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] numberArray = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			numberArray[i] = input.nextInt();
		}
		int minimumValue = findMinimumValue(numberArray);
		System.out.println("Minimum value: " + minimumValue);
		int maximumValue = findMaximumValue(numberArray);
		System.out.println("Maximum value: " + maximumValue);
		input.close();
	}

	public static int findMinimumValue(int[] numberArray) {
		int minimumValue = numberArray[0];
		for (int value : numberArray) {
			if (value < minimumValue)
				minimumValue = value;
		}
		return minimumValue;
	}

	public static int findMaximumValue(int[] numberArray) {
		int maximumValue = numberArray[0];
		for (int value : numberArray) {
			if (value > maximumValue)
				maximumValue = value;
		}
		return maximumValue;
	}
}