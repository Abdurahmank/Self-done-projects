import java.text.SimpleDateFormat;
import java.util.Date;

public class CurentDate {

	public static void main(String[] args) {
		
		Date CurrentDate = new Date();
		System.out.println(CurrentDate);
		
		SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(TimeFormat.format(CurrentDate));
		
		SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(DateFormat.format(CurrentDate));
		
		SimpleDateFormat DayofTheWeek = new SimpleDateFormat("EEEE");
		System.out.println(DayofTheWeek.format(CurrentDate));
		
		SimpleDateFormat clock = new SimpleDateFormat("hh:mm:a");
		System.out.println(clock.format(CurrentDate));
	}

}
