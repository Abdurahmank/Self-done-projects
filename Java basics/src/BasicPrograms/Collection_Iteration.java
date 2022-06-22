package BasicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Iteration {

	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		myList.add("Abdu");
		myList.add("Aswima");
		myList.add("Malu");
		myList.add("Nidhu");
		myList.add("Saleena");
		myList.add("Faizal");
		
		Iterator itr = myList.iterator();
		
		while(itr.hasNext()){
		System.out.println(itr.next());	
		}
		
		
		

	}

}
