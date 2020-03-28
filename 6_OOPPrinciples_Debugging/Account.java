package homework;

public class Account {

	String name;
	String username;
	String govId;
	double balance;
	String password;
	
	public Account(String name, String username, String govId, String password) {
		this.name = name;
		this.username = username;
		this.govId = govId;
		balance = 0;
		this.password = password;
		//this.newObject = newObject;
	}
	
	public Account (String username, double balance) { // deposit
		this.username = username;
		this.balance = balance;
	}

	public Account(String username, String password, double amount) { // withdraw
		this.username = username;
		this.password = password;
		
	}
	public Account(String username, String password, double amount, String recipient) { // transfer
		this.username = username;
		this.password = password;
		
	}
	
	
	//Credentials newObject = new Credentials();

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}
	boolean hasAccess() {
		return true;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getGovId() {
		return govId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setGovId(String govId) {
		this.govId = govId;
	}
	
}
