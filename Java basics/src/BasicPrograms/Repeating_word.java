package BasicPrograms;

public class Repeating_word {

	public static void main(String[] args) {
		
		int ar[] = new int [] {1,2,3,4,5,6,5,4,3};
		 
		for(int i=0; i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
if(ar[i]==ar[j]) {
	System.out.println(ar[j]);
}
	}

		}}}
