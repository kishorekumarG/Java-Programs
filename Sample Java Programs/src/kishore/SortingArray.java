package kishore;

import java.util.Scanner;

/*
 * Ascending Order: Arrays.sort(numberArray);
 * Descending Order: Arrays.sort(numberArray, Collections.reverseOrder());
 * 						Note that it is only for wrapper class
 */
public class SortingArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] numberArray = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			numberArray[i] = input.nextInt();
		}
		System.out.println("Ascending Order....");
		sortArrayInAscendingOrder(numberArray);
		System.out.println("\n" + "Descending Order...");
		sortArrayInDescendingOrder(numberArray);
		input.close();
	}

	public static void sortArrayInAscendingOrder(int[] numberArray) {
		for (int i = 0; i < numberArray.length - 1; i++) {
			for (int j = i; j < numberArray.length; j++) {
				if (numberArray[i] > numberArray[j]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
		for (int value : numberArray)
			System.out.print(value + "  ");
	}

	public static void sortArrayInDescendingOrder(int[] numberArray) {
		for (int i = 0; i < numberArray.length - 1; i++) {
			for (int j = i; j < numberArray.length; j++) {
				if (numberArray[i] < numberArray[j]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
		for (int value : numberArray)
			System.out.print(value + "  ");
	}
}