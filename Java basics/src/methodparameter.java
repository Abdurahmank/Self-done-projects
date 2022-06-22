
public class methodparameter {

	public static void main(String[] args) {
		int b = addno(5,2); //after running the method 5+2=7 is the output so it should be stored in an intiger variable
		System.out.println(b);
	}

	public static int addno (int a, int b) { //int - an int value should be returned from the method
												// a and b are the parameters passed to the addno method
		return a+b; // after running the method 5+2=7 is the output so it should be stored in an integer variable
	}
}
