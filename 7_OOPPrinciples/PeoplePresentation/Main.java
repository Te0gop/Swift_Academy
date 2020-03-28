package homework;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		Worker worker = new Worker();
			
		String firstName = sc.next();

		
		while(!firstName.equals("END")) {
			String lastName = sc.next();
			String salaryOrFacNum = sc.next();
			
			if(firstName.length() < 2 || firstName.length() >= 30) {
				while (firstName.length() < 2 || firstName.length() >= 30) {
					System.out.println("Expected length for <parameter> is between 2 and 30 symbols.");
					firstName = sc.next();
				}
			}
			for (int i = 0; i < firstName.length(); i++) {
				char letter = firstName.charAt(i);
				
				if (!(letter >= 'a' && letter <= 'z') || !(letter >= 'A' && letter <= 'Z')) {
					while (!(letter >= 'a' && letter <= 'z') && !(letter >= 'A' && letter <= 'Z')) {
						System.out.println("Expected only Latin letters in <parameter>.");
						firstName = sc.next();
						letter = firstName.charAt(i);
					}
				}
				if (!(firstName.charAt(0) >= 'A') || !(firstName.charAt(0) <= 'Z')) {
					
					while(!(firstName.charAt(0) >= 'A') || !(firstName.charAt(0) <= 'Z')) {
						System.out.println("Expected upper case letter at first position of <parameter>.");
						firstName = sc.next();
					}
				}		
			}
			
			//lastname 
			
			if(lastName.length() < 2 || lastName.length() >= 30) {
				while (lastName.length() < 2 || lastName.length() >= 30) {
					System.out.println("Expected length for <parameter> is between 2 and 30 symbols.");
					lastName = sc.next();
				}
			}
			for (int i = 0; i < lastName.length(); i++) {
				char letter = lastName.charAt(i);
				
				if (!(letter >= 'a' && letter <= 'z') || !(letter >= 'A' && letter <= 'Z')) {
					while (!(letter >= 'a' && letter <= 'z') && !(letter >= 'A' && letter <= 'Z')) {
						System.out.println("Expected only Latin letters in <parameter>.");
						lastName = sc.next();
						letter = lastName.charAt(i);
					}
				}
				if (!(lastName.charAt(0) >= 'A') || !(lastName.charAt(0) <= 'Z')) {
					
					while(!(lastName.charAt(0) >= 'A') || !(lastName.charAt(0) <= 'Z')) {
						System.out.println("Expected upper case letter at first position of <parameter>.");
						lastName = sc.next();
					}
				}		
			}
			

			//salary or faculty num
			
			if (salaryOrFacNum.length() <= 5) {
				
				int workerSalary = Integer.parseInt(salaryOrFacNum);
				
				if(workerSalary < 0) {
					while(workerSalary < 0) {
						System.out.println("Expected positive number for <parameter>.");
						workerSalary = sc.nextInt();
					}
				}

				int hours = sc.nextInt();
				
				if (hours < 0) {
					while (hours < 0) {
						System.out.println("Expected positive number for <parameter>.");
						hours = sc.nextInt();
					}
				}
		
				worker.setFirstName(firstName);
				worker.setLastName(lastName);
				worker.setWeekSalary(workerSalary);
				worker.setWorkHoursPerDay(hours);
				System.out.println();
				
				System.out.printf("First name: %s\n", worker.firstName);
				System.out.printf("Last name: %s\n", worker.lastName);
				System.out.printf("Occupation: Worker\n");
				System.out.printf("Week salary: %d\n", worker.weekSalary);
				System.out.printf("Hours per day: %d\n", worker.workHoursPerDay);
				System.out.printf("Salary per hour: %.2f\n", worker.salary());
				
				
			} else if (salaryOrFacNum.length() > 5 && salaryOrFacNum.length() <= 10) {
				
				int lectures = sc.nextInt();
				int exercises = sc.nextInt();
				
				if (lectures < 0 || exercises < 0) {
					
					while (lectures < 0) {
						System.out.println("Expected positive number for <parameter>.");
						lectures = sc.nextInt();
					}
					while (exercises < 0) {
						System.out.println("Expected positive number for <parameter>.");
						exercises = sc.nextInt();
					}
				}

				
				student.setFirstName(firstName);
				student.setLastName(lastName);
				student.setFacultyNumber(salaryOrFacNum);
				student.setLecturyCount(lectures);
				student.setExcerciseCount(exercises);
				System.out.println();
				
				System.out.printf("First name: %s\n", student.firstName);
				System.out.printf("Last name: %s\n", student.lastName);
				System.out.printf("Occupation: Student\n");
				System.out.printf("Faculty Number: %s\n", student.facultyNumber);
				System.out.printf("Hours per day: %.2f\n", student.hoursPerDay());
				
				// I'm not sure how to check if lectures and exercises are integers or doubles
			} 
			
			firstName = sc.next();
		}
		
	sc.close();
	}

}
