package kishore;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementOccurences {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		int[] numberArray = new int[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			numberArray[i] = input.nextInt();
		}

		findElementOccurences(numberArray);
		input.close();
	}

	public static void findElementOccurences(int[] numberArray) {

		Arrays.sort(numberArray);

		int noOfOccurences = 1;

		for (int index = 0; index < numberArray.length; index++) {
			if (index < numberArray.length - 1) {
				if (numberArray[index] == numberArray[index + 1]) {
					noOfOccurences++;
				}
			} else {
				System.out.println(numberArray[index] + "'s count is " + noOfOccurences);
			}

			if (index < numberArray.length - 1 && numberArray[index] != numberArray[index + 1]) {
				System.out.println(numberArray[index] + "'s count is " + noOfOccurences);
				noOfOccurences = 1;
			}
		}
	}
}