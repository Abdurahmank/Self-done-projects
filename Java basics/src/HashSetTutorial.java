import java.util.HashSet;
import java.util.Iterator;
public class HashSetTutorial {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Malu");
		set.add("Nidhu");
		set.add("Saleena");
		
		//set.remove("Malu"); // to remove any value from Hash set
	       //set.clear(); //to clear the whloe set
		 System.out.println("size of the hash set = "+set.size());
		 
		 System.out.println("------------------------------------------");
		
		System.out.println(set);
		System.out.println("------------------------------------------");
		System.out.println(set.contains("Malu"));
		System.out.println("------------------------------------------");
		System.out.println(set.isEmpty());
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		Iterator<String> it = set.iterator(); //Printing the Hash set
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		}

}
