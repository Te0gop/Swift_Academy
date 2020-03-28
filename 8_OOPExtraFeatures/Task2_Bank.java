package homework;

import java.util.Scanner;


public class Task2_Bank {

	public static void main(String[] args) {
		
		MorgageAccount morgage = new MorgageAccount();
		LoanAccount loan = new LoanAccount();
		DepositAccaunt deposit = new DepositAccaunt();
		
		Scanner sc = new Scanner(System.in);
		
		final String END_PROGRAM = "END";
		String command = sc.next();
		
		while(!END_PROGRAM.equals(command)) {
			String nameOrIBAN = sc.next();
			
			if(command.equals("OPEN")) {
				
				
				String typeOfClient = sc.next();
				String typeOfAccount = sc.next();
				double balanceOfAccount = sc.nextDouble();
				double interestOfAccount = sc.nextDouble();
				
				if(typeOfAccount.equals("1")) {					
					deposit.open(nameOrIBAN, typeOfClient, typeOfAccount, balanceOfAccount, interestOfAccount);					
				} else if(typeOfAccount.equals("2")) {
					loan.open(nameOrIBAN, typeOfClient, typeOfAccount, balanceOfAccount, interestOfAccount);
				} else if(typeOfAccount.equals("3")) {					
					morgage.open(nameOrIBAN, typeOfClient, typeOfAccount, balanceOfAccount, interestOfAccount);
				}
			} else if(command.equals("PUT")) {
			System.out.println();
			}
			
			
			command = sc.next();
		}
		
		
		
		
		

	}

}
