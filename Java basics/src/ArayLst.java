import java.util.ArrayList;

public class ArayLst {

	public static void main(String[] args) {

		String[] array = new String[3];
		array[0] = "guava";
		array[1] = "orange";
		array[2] = "pappaya";

		System.out.println(array[2]);

		System.out.println("-------------------------------------------------");

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add("cherry");

		System.out.println();
		
		fruits.remove("apple");   //removing by value
		fruits.remove(1);         //removing by index
		//fruits.clear();  // delete all the elements from array list

		System.out.println(fruits.contains("cherry")); //if arraylist contains some value

		System.out.println("-------------------------------------------------");

		System.out.println(fruits);
	}


}
