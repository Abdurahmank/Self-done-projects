package BasicPrograms;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no");
		int no =scan.nextInt();
		
		if(no%2 == 0) {
			System.out.println("No is even");
		}
		else {
			System.out.println("No is odd");
		}

	}

}
