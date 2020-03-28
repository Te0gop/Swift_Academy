package homework;


public class MorgageAccount extends BankOperations {
	private int IBAN;
	private String owner;
	private double balance;
	private double montlyInterestRate;

	public MorgageAccount(int IBAN, String owner, double balance, double montlyInterestRate) {
		this.IBAN = IBAN;
		this.owner = owner;
		this.balance = balance;
		this.montlyInterestRate = montlyInterestRate;
	}
	public MorgageAccount() {
		int IBAN;
		String owner;
		double balance;
		double montlyInterestRate;
	}
	
	public int getIBAN() {
		return IBAN;
	}

	public void setIBAN(int IBAN) {
		this.IBAN = IBAN;
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
		if((period >= 6 && client.equals("1"))) {
			balance = money * montlyInterestRate * (period-6);
		} else if ((period <= 6 && client.equals("1"))) {
			balance = money;
		} else if ((period <= 12 && client.equals("2"))) {
			balance = money * (montlyInterestRate * 0.5) * period;
		} else if ((period > 12 && client.equals("2"))) {
			balance = money * montlyInterestRate * period;
		}
		
	}
	
	
		
	@Override
	public void open(String name, String typeOfClient, String typeOfAccount, double balance, double interest) {
		MorgageAccount morgage = new MorgageAccount(IBAN, typeOfAccount, balance, interest);
		morgage.setIBAN(numberOfIBANS++);
		addMorgage(morgage);
		
	}
	@Override
	protected void setIBAN(String iBAN) {
		// TODO Auto-generated method stub
		
	}


	




}
