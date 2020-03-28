package homework;

import java.util.Scanner;

public class Task2_CredentialsManager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Credentials credentials = new Credentials();

		String command = sc.next();
		
		while (!command.equals("END")) {
			String username = sc.next();
			String password = sc.next();
			
			if(command.equals("ENROLL") || command.equals("AUTH")) {
				if(command.equals("ENROLL")) {
					credentials.enroll(username, password);
				} else {
					credentials.auth(username, password);
				}
				
			} else if (command.equals("CHPASS")) {
				String newPassword = sc.next();
				credentials.chpass(newPassword);
			}

			command = sc.next();
		}
		
		
		sc.close();
	}

}
