package homework;

import java.util.Arrays;

public abstract class BankOperations {
	
	BankOperations[] accounts = new BankOperations[10];
	
	
	int numOfAccounts;
	int numberOfIBANS=1;
	
	public abstract void deposit(double money);
	
	public abstract void generateInterest(double money, int period, String client);
	
	public void print() {
		System.out.println(Arrays.asList(accounts));
	}
	
	public abstract void open(String name, String typeOfClient, String typeOfAccount, double balance, double interest );
	
	public void addLoan(LoanAccount account) {
		accounts[numOfAccounts] = account;
		numOfAccounts++;
	}
	
	protected abstract void setIBAN(String iBAN);

	public void addMorgage(MorgageAccount account) {
		accounts[numOfAccounts] = account;
		numOfAccounts++;
	}
	public void addDeposit(DepositAccaunt account) {
		accounts[numOfAccounts] = account;
		numOfAccounts++;
	}



}
