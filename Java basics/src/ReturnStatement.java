
public class ReturnStatement {

	public static void main(String[] args) {

		String str =PrintMessage();
		System.out.println(str);

		int sum = add(4,8);
		System.out.println(sum);

		String cap = CapLettor("Hi Everyone");
		System.out.println(cap);
	}
	public static String PrintMessage() {
		System.out.println("this is a method");
		return "Abdu";
	}
	public static int add(int a, int b) {
		return a+b;

	}
	public static String CapLettor(String s) {
		return s.toUpperCase();

	}
}
