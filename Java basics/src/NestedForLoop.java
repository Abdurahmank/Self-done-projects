
public class NestedForLoop {

	public static void main(String[] args) {

		String[][] Coulours = {{"red", "blue","yellow"},
				{"cyan","majenta","orange"}
		};


		for (int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(Coulours[i][j]);



			}

			System.out.println("----------------------------------");
			for(int k=0; k<3; k++) {		//1st for loop condition becomes true it will jump to next for loop, when ever 2nd for loop becomes false, then only control will come back to 1st for loop
				for(int m=0; m<5; m++) {
					System.out.println("k= "+k+" m= "+m);
				}
			}

		}
	}
}

