package BasicPrograms;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("Enter the no");
		input=scan.nextInt(); 
		
		int sum=0; 
		
		while(input!=0) {
			
			int lastdigit=input%10; 
			sum = sum+lastdigit; 
			input=input/10; 
		}
		System.out.println("sum= "+sum);

	}

}
