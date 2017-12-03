package kishore;

import java.util.Scanner;

public class AreaOfCircle {

	static final double pi = 3.14;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = input.nextDouble();
		double area = findAreaOfCircle(radius);
		System.out.println("Area of Circle: " + area);
		input.close();
	}
	
	public static double findAreaOfCircle(double radius) {
		double area = pi * radius * radius;
		return area;
	}
}