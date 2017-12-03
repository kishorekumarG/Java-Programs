package kishore;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number (1 to number): ");
		int number = input.nextInt();
		int sum = findSumUptoNumber(number);
		System.out.println("Sum: " + sum);
		input.close();
	}
	public static int findSumUptoNumber(int number) {
		int sum = (number * (number + 1)) / 2;
		return sum;
	}
}
