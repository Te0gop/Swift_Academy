import java.util.Scanner;

public class SwiftDate {
	public int year;
	public int month;
	public int day;
	public int yearTwo;
	public int monthTwo;
	public int dayTwo;
	public boolean isLeapYear = false;
	boolean key = false;
	int diff;
	int century;
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}

	public boolean isLeapYear() {
		
		if (yearTwo % 4 == 0 && yearTwo != 0) {
			System.out.print("It is LEAP year.");
			
		}
		
		else if (year % 4 == 0 && !key) {
			System.out.print(" It is LEAP year.");
			key = true;
		} 
		return isLeapYear;

	}
	
	public int century() {
		System.out.println();
		century = year / 100 + 1;
		return century;
	}
	public int getDaysDiffrence() {
		
		diff = (year * 365) + (31 - month) + (day) -
				(yearTwo * 365) + (31-monthTwo) + (dayTwo);
		
		diff = Math.abs(diff);
		return diff;
	}

	public SwiftDate(int year, int month, int day, int yearTwo, int monthTwo, int dayTwo) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.yearTwo = yearTwo;
		this.monthTwo = monthTwo;
		this.dayTwo = dayTwo;

	}


public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	

		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int yearTwo = sc.nextInt();
		int monthTwo = sc.nextInt();
		int dayTwo = sc.nextInt();
		SwiftDate date = new SwiftDate(year, month, day, yearTwo, monthTwo, dayTwo);
		
		System.out.print(date.getDaysDiffrence());
		System.out.printf("%d %d %d - %d century.", year, month, day, date.century());
		date.isLeapYear();
		System.out.printf("%d %d %d - %d century.", yearTwo, monthTwo, dayTwo, date.century());
		date.isLeapYear();
		

	sc.close();
	}


}
