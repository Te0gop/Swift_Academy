package homework;

import java.util.Scanner;

public class Task3_BankManagement {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		Scanner sc = new Scanner(System.in);
		
		String command = sc.next();
		
		while (!command.equals("END")) {
			
			String username = sc.next();
			
			if (command.equals("OPEN") || command.equals("CLOSE") || command.equals("WITHDRAW") 
					|| command.equals("TRANSFER")) {
				
				String password = sc.next();
				
				if (command.equals("OPEN")) {
					String name = sc.next();
					String govId = sc.next();
					bank.openAccount(name, govId, username, password);
				} else if (command.equals("CLOSE")) {
					bank.closeAccount(username, password);
				} else if (command.equals("WITHDRAW")) {
					double amount = sc.nextDouble();
					bank.withdraw(username, password, amount);
				} else if (command.equals("TRANSFER")) {
					double amount = sc.nextDouble();
					String recipient = sc.next();
					bank.transfer(username, password, amount, recipient);
				}
				
			} else if (command.equals("DEPOSIT")) {
				double amount = sc.nextDouble();
				bank.deposit(username, amount);
			}
			
			command = sc.next();
		}
		
		System.out.println(bank.getAssets());
		bank.endProgram();
		
		sc.close();
	}

}
