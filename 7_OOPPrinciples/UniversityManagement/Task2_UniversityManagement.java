package UniversityManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2_UniversityManagement {

	public static void main(String[] args) {
		
		int universityBalance = 500;
		
		Scanner sc = new Scanner(System.in);
		final String END_PROGRAM = "END";
		
		//Employee newStudent = new Teacher();
		
		
		String command = sc.next();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Student obj = new Student();
		
		while (!END_PROGRAM.equals(command)) {
			
			if (command.equals("NEW")) {
				String type = sc.next();
				


				
				
				if(type.equals("MAINT") || type.equals("ADMIN") || type.equals("TEACH")) {

					
					
					if(type.equals("MAINT")) {
						
						
		
					} else if (type.equals("TEACH")) {
						

					} else if (type.equals("ADMIN")) {
						
					}
					
				} else {
					
				}
				
				
			} else if (command.equals("WORK")) {
				
				
				
			} else if (command.equals("IDLE")) {
				
				
			}
			
			
			
			
			
		}

	}

}
