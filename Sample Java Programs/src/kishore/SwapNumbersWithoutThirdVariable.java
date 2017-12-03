package kishore;

import java.util.Scanner;

public class SwapNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		swapTwoNumbersWithoutThirdVariable(number1, number2);
		input.close();
	}

	public static void swapTwoNumbersWithoutThirdVariable(int number1, int number2) {
		System.out.println("The two numbers before swapping are..");
		System.out.println(number1 + "  " + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("The two numbers after swapping are..");
		System.out.println(number1 + "  " + number2);
	}
}
