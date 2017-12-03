package kishore;

import java.util.Scanner;

public class ArrayElementSearch {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] numberArray = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			numberArray[i] = input.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		int element = input.nextInt();
		System.out.println("Element found : " + searchElement(numberArray, element));
		input.close();
	}

	public static boolean searchElement(int[] numberArray, int element) {
		for (int value : numberArray) {
			if (value == element)
				return true;
		}
		return false;
	}
}