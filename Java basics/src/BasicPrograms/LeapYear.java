package BasicPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		int LeapYear = scan.nextInt();
		
		if((LeapYear % 4==0) || (LeapYear % 100 !=0 && LeapYear % 4 ==0))
		{
			System.out.println("Entered year is a leap year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
