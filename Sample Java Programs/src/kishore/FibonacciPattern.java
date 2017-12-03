package kishore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciPattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = input.nextInt();
		System.out.println(getFibonacciSeries(limit));
		input.close();
	}

	// Method to get the fibonacci pattern and return as a list
	public static List<Integer> getFibonacciSeries(int limit) {
		List<Integer> fibonacciSeries = new ArrayList<Integer>();
		int f1 = -1, f2 = 1, f3 = 0;
		for (int i = 0; i < limit; i++) {
			// Business Logic; A sum of the two preceding numbers;
			f3 = f1 + f2;
			fibonacciSeries.add(f3);
			f1 = f2;
			f2 = f3;
		}
		return fibonacciSeries;
	}
}