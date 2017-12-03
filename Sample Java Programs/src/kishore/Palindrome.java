package kishore;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println(number + " is palindrome: " + isPalindrome(number));
		input.close();
	}

	public static boolean isPalindrome(int number) {

		int numberInReverse = 0, digit;
		int originalNumber = number;
		while (number > 0) {
			digit = number % 10;
			numberInReverse = (numberInReverse * 10) + digit;
			number /= 10;
		}
		if (originalNumber == numberInReverse)
			return true;
		return false;
	}
}