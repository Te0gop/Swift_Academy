package homework;

public class Bank {
	double asset;
	
	
	Account[] listOfAccounts = new Account[5];
	int storedAccounts;

	 public void openAccount(String name, String govId, String username, String password) {
		 if (storedAccounts <= listOfAccounts.length-1) {
			 Account newAccount = new Account(name, username, govId, password);
			 
			 listOfAccounts[storedAccounts] = newAccount;
			 storedAccounts++;

			 System.out.println("OPEN success");
		 } else {
			 System.out.println("OPEN fail");
		 }
	}
	 public void closeAccount(String username, String password) {
		 boolean isClosed = false;
		 
		 for (int i = 0; i < listOfAccounts.length; i++) {
			 
			 if (listOfAccounts[i] != null) {
				 String nameToCheck = listOfAccounts[i].getUsername();
				 String passToCheck = listOfAccounts[i].getPassword();
				 if (listOfAccounts[i] != null && nameToCheck.equals(username) && passToCheck.equals(password)) {
						listOfAccounts[i] = null;
						System.out.println("CLOSE success");
						isClosed = true;
						break;
				 }
			 }
		 }
		 if(!isClosed) {
			 System.out.println("CLOSE fail");
		 }	 
	 }
	 
	 public void deposit(String username, double amount) {
		 
		 for (int i = 0; i < listOfAccounts.length; i++) {
			 
			 if (listOfAccounts[i] != null && amount > 0) {
				 String nameToCheck = listOfAccounts[i].getUsername();
				 
				 if (listOfAccounts[i] != null && nameToCheck.equals(username)) {
						listOfAccounts[i].deposit(amount);
						asset += amount;
						System.out.println("DEPOSIT success");
						break; 	
				 }
			 } else {
				 System.out.println("DEPOSIT fail");
				 break;
			 }
		  }	
	   }
	 
	 
	 
	 public void withdraw(String username, String password, double amount) {
		 boolean notFound = true;
		 for (int i = 0; i < listOfAccounts.length; i++) {
			 
			 if (listOfAccounts[i] == null) {
				 System.out.println("WITHDRAW fail");
				 notFound = false;
				 break;
			 } else if (listOfAccounts[i] != null) {
				 
				 double balance = listOfAccounts[i].getBalance();
				 String nameToCheck = listOfAccounts[i].getUsername();
				 String passToCheck = listOfAccounts[i].getPassword();
				 
				 if (listOfAccounts[i] != null && balance >= amount && nameToCheck.equals(username)
						 && passToCheck.equals(password)) {
					 
					 listOfAccounts[i].withdraw(amount);
					 asset -= amount;
					 System.out.println("WITHDRAW success");
					 notFound = false;
					 break;
					 
				 	}
				 
			 	}
			 	
			}
		 if(notFound) {
		 		System.out.println("WITHDRAW fail");
		 	}
	   }
	 
	 public void transfer(String username, String password, double amount, String recipient) {
		 boolean notFound = true;
		 
		 	for (int i = 0; i < listOfAccounts.length; i++) {
			 
				 
				 String nameToCheck = listOfAccounts[i].getUsername();
				 String passToCheck = listOfAccounts[i].getPassword();
				 double balance = listOfAccounts[i].getBalance();
				 
			 if (listOfAccounts[i] != null && balance >= amount && nameToCheck.equals(username)
					 && passToCheck.equals(password)) {
				 
				 listOfAccounts[i].withdraw(amount);
				 notFound = false;
				 break;
			 } 
		  }
		 	if (!notFound) {
		 		for (int j = 0; j < listOfAccounts.length; j++) {
		 			boolean isFailed = false;
					 String recipientName = listOfAccounts[j].getUsername();
					 
					 if (recipientName.equals(recipient)) {
						 	listOfAccounts[j].deposit(amount);
						 	System.out.println("TRANSFER success");
						 	isFailed = true;
							break;
							
						} if (isFailed) {
							System.out.println("TRANSFER fail");
						}
				 	}
				 
			 } else {
				 System.out.println("TRANSFER fail");
			 	}
	 		}
	 
	 public double getAssets() {
		 return asset;
	 }
	 public void endProgram() {
		 for (int i = 0; i < listOfAccounts.length; i++) {
			 if (listOfAccounts[i] != null) {
				 String nameToPrint = listOfAccounts[i].getName();
				 String govIdToPrint = listOfAccounts[i].getGovId();
				 double balanceToPrint = listOfAccounts[i].getBalance();
				 System.out.printf("%s, %s, %.2f%n", nameToPrint, govIdToPrint, balanceToPrint);
			 }
		 }
	 }
}
