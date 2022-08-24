package Package;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.Base;

public class TetsCases extends Base {

	@Test

	public void HomePage() throws IOException, InterruptedException {

		driverInitialization();
		
		driver.get("https://www.google.com");
		driver.close();

	}
}
