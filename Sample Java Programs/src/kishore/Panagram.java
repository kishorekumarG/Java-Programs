package kishore;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sequence = input.nextLine();
		String[] alphabets = sequence.split(" ");

		
		int N  = input.nextInt();
		int[] index = new int[N];
		
		for(int i = 0; i < N; i ++){
			index[i] = input.nextInt();
		}
		
		for(int i = 1; i <= alphabets.length; i++){
			for(int j = 0; j < index.length; j++){
				if(i == index[j])
					System.out.println(alphabets[i-1]);		
			}
		}
		input.close();
	}
}