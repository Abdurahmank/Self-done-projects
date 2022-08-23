
public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Abdu Rahman k";
		System.out.println("Name is :"+name);
		System.out.println("Uppercase Name is :"+name.toUpperCase());
		System.out.println("Lowercase Name is :"+name.toLowerCase());
		System.out.println("First char is :"+name.charAt(0));
		System.out.println("Last char is :"+name.charAt(name.length()-1));
		System.out.println("Length of name is :"+name.length());
		System.out.println("Substring starting from 7 and ending in 13 is :"+name.substring(7,13));
		System.out.println("Substring starting from 5th position is :"+name.substring(5));
		System.out.println("Index of R in name is :"+name.indexOf("R"));
		

	}

}
