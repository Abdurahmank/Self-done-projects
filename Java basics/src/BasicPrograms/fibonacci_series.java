package BasicPrograms;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {

			int f1,f2=0,f3=1;
			
			Scanner scan = new Scanner(System.in);
				System.out.println("Enter the no");
				int no = scan.nextInt();
				
				for(int i=0; i<=no; i++) {
					System.out.println(f3+"");
					f1=f2;
					f2=f3;
					f3=f1+f2;
				}
			}
	}
