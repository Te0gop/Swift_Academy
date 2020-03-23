package homework;

import java.sql.SQLException;
import java.util.Scanner;

public class Task2_AddressDB extends MySqlAddressData {

	public static void main(String[] args) throws SQLException {
		
		System.out.printf("Enter one of the following commands: %n"
				+ "getFullAddress, addAddress or getAddresses. %n");
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		
		if(command.equals("getFullAddress")) {
			getFullAddress();
		} else if (command.equals("addAddress")) {
			addAddress();
		} else if (command.equals("getAddresses")) {
			getAddresses();
		} else {
			System.out.println("Invalid command.");
		}
		sc.close();
	}

}
