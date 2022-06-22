package BasicPrograms;

import java.util.Scanner;

public class ReverseTheNumber {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the no");
			
			int num = scan.nextInt();
			
			while(num>0) {
				
				int rev=num%10;
				System.out.println(rev);
				num=num/10;
			}

		}

	}
