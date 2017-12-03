package kishore;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check for prime or not: ");
		int number = input.nextInt();
		System.out.println(number + " is prime : " + isPrime(number));
		input.close();
	}
	
	private static boolean isPrime(int number) {
		int i = 2;
		while(i <= number/2) {
			if (number % i == 0)
				return false;
			i++;
		}
		return true;
	}
}