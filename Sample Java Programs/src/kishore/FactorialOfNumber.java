package kishore;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find factorial: ");
		int number = input.nextInt();
		int factorial = findFactorial(number);
		System.out.println("Factorial of the number " + number + " is " + factorial);
		input.close();
	}
	
	public static int findFactorial(int number) {
		if (number == 1)
			return 1;
		return number * findFactorial(number - 1);
	}
}
