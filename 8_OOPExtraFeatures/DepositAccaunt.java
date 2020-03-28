package homework;

public class DepositAccaunt extends BankOperations {

	private String IBAN;
	private String owner;
	private double balance;
	private double montlyInterestRate;

	public DepositAccaunt(String IBAN, String owner, double balance, double montlyInterestRate) {
		super();
		this.IBAN = IBAN;
		this.owner = owner;
		this.balance = balance;
		this.montlyInterestRate = montlyInterestRate;
	}
	public DepositAccaunt() {
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
	
	public void withdraw() {
		
	}

	@Override
	public void deposit(double money) {
		System.out.println("Invalid operation");
		
	}

	@Override
	public void generateInterest(double money, int period, String client) {
		balance = money * montlyInterestRate * period;
	}

	@Override
	public void open(String name, String typeOfClient, String typeOfAccount, double balance, double interest) {
		DepositAccaunt deposit = new DepositAccaunt(IBAN, typeOfAccount, balance, interest);
		addDeposit(deposit);
		
	}
	
}
