import java.util.Scanner;

public class Finallykeyword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {

			int a =5/0;
			System.out.println(scan.next());

		}
		catch(ArithmeticException e){  //Catching Exception 1
			System.out.println(e);
		}
		catch(NullPointerException e){  //Catching Exception 2
			System.out.println(e);
		}

		catch(Exception e){    //Catching Exception 3
			System.out.println(e);
		}

		finally{
			scan.close();
			System.out.println("This is finally block");
		}
	}

}
