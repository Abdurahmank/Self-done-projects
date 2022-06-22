package BasicPrograms;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 1st no");
		int A = scan.nextInt();
		
		System.out.println("Enter 2nd no");
		int B = scan.nextInt();
		
		int Sum = A+B;
		int Avg = ((A+B)/2);
		
		System.out.println("Sum= "+Sum + " Average= "+Avg);

	}

}
