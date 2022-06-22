import java.util.Scanner;

public class StatementBreak {

	public static void main(String[] args) {

		int[] array = {45,67,89,43,26,80,27,57};

		for (int i=0; i<array.length; i++) {
			if(array[i]==26) {
				break;

			}
			System.out.println(array[i]);
		}
		/*System.out.println("--------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no");
		int no= scan.nextInt();
		
		switch(no) {
		case 0:
			System.out.println("case zero");
			break;
			
		case 1:
			System.out.println("case one");
			break;
			
			default:
				System.out.println("default value");
				break;*/
		System.out.println("--------------------------------------------");
		for(int i=0; i<3; i++) {
			for(int k=0; k<5; k++) {
				System.out.println(i+","+k);
				break; //this break, wont let the 'k' run second time,before it will break from the second for loop and jump to first
			}
		}
		}
	

	
}