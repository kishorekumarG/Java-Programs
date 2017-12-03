package kishore;

import java.util.Scanner;

public class NumberType {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println(number + " is Armstrong Number: " + isArmstrongNumber(number));
		System.out.println(number + " is Strong Number: " + isStrongNumber(number));
		System.out.println(number + " is Perfect Number: " + isPerfectNumber(number));
		input.close();
	}

	public static boolean isArmstrongNumber(int number) {
		int digit, sum;
		sum = 0;
		int originalNumber = number;
		while (number != 0) {
			digit = number % 10;
			sum += digit * digit * digit;
			number = number / 10;
		}
		return (originalNumber == sum);
	}
	public static boolean isStrongNumber(int number) {
		int factorialSum = 0;
		int originalNumber = number;
		while (number > 0) {
			factorialSum += findFactorial(number % 10);
			number /= 10;
		}
		return (factorialSum == originalNumber);
	}

	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		int originalNumber = number;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return (originalNumber == sum);
	}

	public static int findFactorial(int number) {
		if (number == 1)
			return 1;
		return number * findFactorial(number - 1);
	}
}
