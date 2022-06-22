package BasicPrograms;

import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius = scan.nextInt();
		
		double Area = Math.PI * radius*radius;
		System.out.println("Area of circle= "+ Area);
}
}