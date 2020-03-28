package bg.swift;

public class Task6_SecondsInBiggerIntervals {
	public static void main(String[] args) {

		int inputSeconds = 1234567;
		
		final byte MINUTES = 60; // 1 minute has 60 seconds.
		final short HOURS = 60 * 60; // 1 minute has 60 seconds and 1 hour has 60 minutes.
		final int DAYS = HOURS * 24; // 1 minute has 60 seconds, 1 hour has 60 minutes, and 1 day has 24 hours.
		
		int convertedToDays = inputSeconds / DAYS;
		int convertedToHours = (inputSeconds % DAYS) / HOURS; // reminder give us remaining number for hours and etc.
		int convertedToMinutes = ((inputSeconds % DAYS) % HOURS) / MINUTES;
		int convertedToSeconds = ((inputSeconds % DAYS) % HOURS) % MINUTES;
		
		System.out.println(convertedToDays + " days, " + convertedToHours + " hours, " + convertedToMinutes + " minutes, " + convertedToSeconds + " seconds ");
 
	}
}
