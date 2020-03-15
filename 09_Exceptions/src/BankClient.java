
public class BankClient {
public static void main(String[] args) {
	Bank b = new Bank();
	
	try {
		b.withdrawMoney(5);
	} catch(InvalidBankOperation e) {
		
	}
	
}
}
