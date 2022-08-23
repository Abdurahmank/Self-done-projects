
public class Method_calling {

	public static void main(String[] args) {
		
		Method_calling add = new Method_calling(); //method calling using object creation
		add.addition();
		
		subtarction();  //directly calling subtract method as it is declared with static keyword
		
		int d = multiplication(); 	//calling multiplication method directly and assigning the return value to d
		System.out.println(d);

	}

	public void addition() {
		System.out.println("addition"); 
	}
	
	public static void subtarction() {
		System.out.println("Subtraction");
	}
	
	public static int multiplication() {
		int a=5,b=5;
		int c= a*b;
		
		return c;
		
	} 
}
