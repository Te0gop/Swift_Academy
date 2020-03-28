package homework;

public class LoanAccount extends BankOperations {
	private String IBAN;
	private String owner;
	private double balance;
	private double montlyInterestRate;

	public LoanAccount(String IBAN, String owner, double balance, double montlyInterestRate) {
		this.IBAN = IBAN;
		this.owner = owner;
		this.balance = balance;
		this.montlyInterestRate = montlyInterestRate;
	}
	public LoanAccount() {
		String IBAN;
		String owner;
		double balance;
		double montlyInterestRate;
	}
	
	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMontlyInterestRate() {
		return montlyInterestRate;
	}

	public void setMontlyInterestRate(double montlyInterestRate) {
		this.montlyInterestRate = montlyInterestRate;
	}

	
	public void deposit(double money) {
		balance += money;
		
	}

	public void generateInterest(double money, int period, String client) {
		if((period <= 3 && client.equals("1")) || (period <= 2 && client.equals("2"))) {
			balance = money;
		} else if (client.equals("1")) {
			balance = money * montlyInterestRate * (period-3);
		} else if (client.equals("2")) {
			balance = money * montlyInterestRate * (period-2);
		}
		
	}

	@Override
	public void open(String name, String typeOfClient, String typeOfAccount, double balance, double interest) {
		LoanAccount loan = new LoanAccount(IBAN, typeOfAccount, balance, interest);
		addLoan(loan);
		
		
	}
	
	


}
