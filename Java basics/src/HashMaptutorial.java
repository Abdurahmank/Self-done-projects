import java.util.HashMap;

public class HashMaptutorial {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Malu", 24); //adding keys and values to hash map
		map.put("Me", 27);
		map.put("Nidhu", 13);
		map.put("Faisal", 51);
		map.put("Aazima", 21);
		
		//map.remove("me"); //removing key and value
		//map.clear(); //deleting all values and keys
		
		System.out.println(map.containsKey("Me")); //if conatains some key
		System.out.println("----------------------------------------");
		System.out.println(map.containsValue(13)); //if conatains some value
		System.out.println("----------------------------------------");
		System.out.println(map);
		System.out.println("----------------------------------------");
		System.out.println("Nidhus age is  ="+map.get("Nidhu")); //taking specific value out from hashmap
		System.out.println("----------------------------------------");
		System.out.println("Map size ="+map.size());
		System.out.println("----------------------------------------");
		System.out.println("My new age is = "+map.replace("Me", 20)); //replacing my age
		
		
		

	}

}
