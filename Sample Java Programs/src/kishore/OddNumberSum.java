package kishore;

import java.util.Scanner;
import java.util.TreeSet;

public class OddNumberSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TreeSet<Integer> result = new TreeSet<Integer>();

		int n = input.nextInt();
		int[] list1 = new int[n];
		for (int i = 0; i < n; i++)
			list1[i] = input.nextInt();

		int m = input.nextInt();
		int[] list2 = new int[m];
		for (int i = 0; i < m; i++)
			list2[i] = input.nextInt();

		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i] != list2[j] && j == list2.length - 1)
					result.add(list2[j]);

			}
		}
		System.out.println(result);
		input.close();
	}
}