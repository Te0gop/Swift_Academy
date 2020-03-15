
public class Bank {
	public void withdrawMoney(double amount) throws InvalidBankOperation {
		if (amount < 0) {
			System.out.println("invalid amount");
			throw new InvalidBankOperation();
		}
		System.out.println("Successfully withdrow " + amount);
	}
}
