package BasicPrograms;

import java.util.Scanner;

public class SumOf_N_nos {

	public static void main(String[] args) {
		
		int sum=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no");
		int num = scan.nextInt();
		
		for(int i=0; i<=num; i++) {
			
			sum = sum + i; 
		}
		System.out.println(sum);
	}

}
