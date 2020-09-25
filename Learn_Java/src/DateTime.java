import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTime {
	public static void main(String[] args)
	{
		
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	LocalDateTime dateTime = LocalDateTime.now();
	
	System.out.println(dateTime);
	
	System.out.println(dtf.format(dateTime));
	
	LocalDate date = LocalDate.now();
	
	System.out.println(date);
	
	System.out.println(DateTimeFormatter.ofPattern("yy/MM/dd").format(date));
	
	Calendar cal = Calendar.getInstance();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
	
	System.out.println(sdf.format(cal.getTime()));
	}
}
