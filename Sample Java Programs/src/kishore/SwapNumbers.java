package kishore;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		swapTwoNumbers(number1, number2);
		input.close();
	}


	public static void swapTwoNumbers(int number1, int number2) {
		System.out.println("The two numbers before swapping are..");
		System.out.println(number1 + "  " + number2);
		int temp = number2;
		number2 = number1;
		number1 = temp;
		System.out.println("The two numbers after swapping are..");
		System.out.println(number1 + "  " + number2);
	}
}
