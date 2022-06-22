
public class twoDarray {

	public static void main(String[] args) {

		int[][] array = {{20,30,40},
				{50,60,70},
				{5,7,8}
		};
		//System.out.println(array[0][0]);
		//System.out.println(array[0][1]);

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(array[i][j]);

			}
		}

	}
}