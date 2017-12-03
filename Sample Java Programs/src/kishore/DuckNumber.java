package kishore;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check for duck number or not");
		int number = input.nextInt();
		System.out.println("Duck Number : " + checkDuckNumber(number));
		input.close();
	}
	public static boolean checkDuckNumber(int number) {
		while (number > 0) {
			if (number % 10 == 0) {
				return true;
			}
			number = number / 10;
		}
		return false;
	}
}
