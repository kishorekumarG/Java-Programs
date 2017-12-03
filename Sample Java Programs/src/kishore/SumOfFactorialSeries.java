package kishore;

import java.util.Scanner;

public class SumOfFactorialSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit to find sum of factorial series: ");
		int number = input.nextInt();
		System.out.println("Sum of Factorial Series upto " + number + " is " + addFactorials(number));
		input.close();
	}
	
	public static int addFactorials(int number) {
		int sum = 0, i = 1;
		while (i <= number) {
			sum += findFactorial(i);
			i++;
		}
		return sum;
	}

	public static int findFactorial(int number) {
		if (number == 1)
			return 1;
		return number * findFactorial(number - 1);
	}

}
