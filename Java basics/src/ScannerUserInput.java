import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Enter your car");
		String car = scan.next();
		System.out.println("your age is "+age+" and "+ "your car is "+car);

	}

}
