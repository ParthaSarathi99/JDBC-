package JavaFeatures;

import java.time.*;

public class DateTimeDemo {

	public static void main(String[] args) {
		//How to get today's date in Java 8
		LocalDate today = LocalDate.now(); 
		System.out.println("Today's Local date : " + today);

		//to get current day, month and year in Java 8
		int year = today.getYear(); 
		int month = today.getMonthValue(); 
		int day = today.getDayOfMonth(); 
		System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);

		//to check if two dates are equal in Java 8
		LocalDate date1 = LocalDate.of(2014, 01, 14); 
		if(date1.equals(today)){ 
			System.out.printf("Today %s and date1 %s are same date %n", today, date1); }

		//How to check for recurring events e.g. birthday in Java 8
		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14); 
		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth()); 
		MonthDay currentMonthDay = MonthDay.from(today); 
		if(currentMonthDay.equals(birthday)){ 
			System.out.println("Many Many happy returns of the day !!"); }
		else{ System.out.println("Sorry, today is not your birthday"); }

//to get current Time in Java 8		

		LocalTime time = LocalTime.now(); 
		System.out.println("local time now : " + time);
//How to add hours in time
		
		LocalTime newTime = time.plusHours(2); 
		System.out.println("Time after 2 hours : " + newTime);

		//Dealing with time zones in Java 8
		ZoneId america = ZoneId.of("America/New_York"); 
		LocalDateTime localtDateAndTime = LocalDateTime.now(); 
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america ); 
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork); 

		//How to represent fixed date e.g. credit card expiry, YearMonth

		YearMonth currentYearMonth = YearMonth.now(); 
		System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth()); 
		YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY); 
		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);

		
		
		

		
		

	}

}
