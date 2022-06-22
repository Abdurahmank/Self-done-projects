package BasicPrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int input,result=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no for finding factorial");
		input = scan.nextInt();
		
		while(input>0) {
			
			result = result*input;
			input--;
			
		}
System.out.println("Factorial:= "+result);
	}

}
