import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class StringDateResource
{
	public static void main(String... args)
	{
		StringDateResource obj = new StringDateResource();
		obj.testDateCalendarLocale();
	}
	public void testDateCalendarLocale()
	{

			Date date = new Date();
			System.out.println("The date is "+date);
			System.out.println("The current time in millisec after 01-01-1971 is "+date.getTime());
			String s = date.toString();


			date.setTime(date.getTime() + 24*60*60*1000);
			System.out.println("The date after adding 1 day to currentDate is "+date);
			
			// make a calendar
			Calendar calendar = Calendar.getInstance();
			
			calendar.setTime(new Date());
			
			System.out.println(calendar.getTime());
			calendar.add(Calendar.DAY_OF_WEEK,1);
			System.out.println(calendar.getTime());
			
	}
}














