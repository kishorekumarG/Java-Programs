package kishore;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		System.out.println("Sum of digits: " + findSumOfDigits(number));
		input.close();
	}
	
	public static int findSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += (number % 10);
			number = number / 10;
		}
		return sum;
	}
}