import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.OffsetDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

class DateTest
{
	public static void main(String... args) throws InterruptedException
	{
		DateTest obj = new DateTest();
		obj.testDates();
		String birthDateAndTime = args.length>0 ? args[0] : "1988-02-08T10:00:00";
		obj.getNoOfHoursSinceBirth(birthDateAndTime);
	}
	public void testDates() throws InterruptedException
	{
		LocalDate localDate = LocalDate.now();
     	LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
		System.out.println("The date and time in my country right now is "+ localDateTime);
		Thread.sleep(567);
		
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println("The date and time in my country right now is with factory method "+ localDateTime1);

		LocalDate localDate1 = LocalDate.parse("2017-08-21");
		System.out.println(localDate1);
		LocalDate localDate2 = LocalDate.of(2017,8,21);
		System.out.println(localDate2);
		LocalDateTime localDateTime2 = LocalDateTime.parse("2017-09-30T07:23:45");
		System.out.println(localDateTime2);
		
		LocalDateTime localDateTime3 = LocalDateTime.of(2019,07,21,10,10,10);
				System.out.println(localDateTime3);


		LocalDateTime localDateTime4 = LocalDateTime.parse("2017-09-30T07:23:45");
		LocalDateTime localDateTime5 = LocalDateTime.parse("2017-09-30 07:23:45",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				System.out.println(localDateTime5);
		String localDateTime6 = localDateTime5.format(DateTimeFormatter.ofPattern("yyyy"));
				System.out.println(localDateTime6);

	}
	public void getNoOfHoursSinceBirth(String birthDateAndTime)
	{
		LocalDateTime localDateTime = LocalDateTime.parse(birthDateAndTime);

		System.out.println("The local date and time without formatter "+localDateTime);
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	LocalDateTime current = LocalDateTime.now();
	System.out.println("After 10 days exactly "+ current.plusDays(10).format(dtf1));
	System.out.println("After 2 hours exactly "+ current.plusHours(2).format(dtf1));
	System.out.println("After 10 months exactly "+ current.plusMonths(10).format(dtf1));
	System.out.println("After 10 minutes exactly "+ current.plusMinutes(10).format(dtf1));
	System.out.println("After 10 years exactly "+ current.plusYears(10).format(dtf1));
	System.out.println("Day of week of your birthday  "+ localDateTime.getDayOfWeek());
	ZonedDateTime zdt1 = ZonedDateTime.now();
	System.out.println(zdt1);
	ZonedDateTime zdt2 = ZonedDateTime.of(current,ZoneId.of("US/Pacific"));
	System.out.println(zdt2);
	ZoneId pacific = ZoneId.of("US/Pacific");
	System.out.println("The current time in US Pacific is "+zdt1.withZoneSameInstant(pacific));
	
	System.out.println(pacific.getRules().isDaylightSavings(zdt2.toInstant()));
	}
}
















