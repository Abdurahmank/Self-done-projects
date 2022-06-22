import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException {
		//How to read a file in Java
		
		File file = new File("C:\\Users\\abdur\\Downloads\\Sample3.txt"); //reading the file
		Scanner scan = new Scanner(file); //scanning the lines
		/*while(scan.hasNextLine()) { //looping each line 
			System.out.println(scan.nextLine());	//printing each line
		 */		

		//how to write/create a file in Java
		String fileContent="this is a file";
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.hasNextLine()+"\n");
		}
		FileWriter writer = new FileWriter("C:\\Users\\abdur\\Downloads\\JavaCreated.txt");
		writer.write(fileContent);
		writer.close();
		
		
		
		
	}


}

