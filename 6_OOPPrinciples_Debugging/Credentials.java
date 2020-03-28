package homework;

import java.util.ArrayList;

public class Credentials{

	private String username;
	public String password;
	ArrayList<String> list = new ArrayList<String>();
	
	public Credentials() {
		
	}
	
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void enroll (String user, String pass) {
		username = user;
		password = pass;
		System.out.println("ENROLL success");
		list.add(password);
	}
	
	public void auth (String user, String pass) {
		if (user.equals(username) && pass.equals(password)) {
			System.out.println("AUTH success");
		} else {
			System.out.println("AUTH fail");
		}
	}
	
	public void chpass (String newPass) {
		 boolean isRepeating = false;
		
		if (!password.equals(newPass)) {
			
			for(String check : list) {
				
				if (check.equals(newPass)) {
					System.out.println("CHPASS fail");
					isRepeating = true;
					break;
				}
			}
			if (!isRepeating) {
				list.add(newPass);
				System.out.println("CHPASS success");
				password = newPass;
			}
			
		} else {
			System.out.println("CHPASS fail");
		}
	}

	

}
