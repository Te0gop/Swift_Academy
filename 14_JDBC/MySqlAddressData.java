package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MySqlAddressData {
	public static void getFullAddress() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/addressdb", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select addresses.number, streets.name, "
								+ "addresses.apartmentNo, municipalities.name, "
								+ "populated_areas.name, region.name, countries.name from countries "
								+ "inner join region "
								+ "on countries.id = region.id " 
								+ "inner join populated_area_types "
								+ "on populated_area_types.id = region.id "
								+ "inner join populated_areas "
								+ "on populated_areas.id = region.id "
								+ "inner join municipalities "
								+ "on municipalities.id = region.id "
								+ "inner join streets "
								+ "on streets.id = region.id " 
								+ "inner join addresses "
								+ "on addresses.id = region.id where addresses.number = ?")) {
			
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("Enter addresses's id");
				int id = sc.nextInt();
				
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
						System.out.printf(rs.getString(1) + ", " + rs.getString(2) + ", Ap. "
								+ rs.getString(3) + ", " + rs.getString(4) + ", "
								+ rs.getString(5) + ", " + rs.getString(6) + ", " + rs.getString(7));
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid id.");
			}
			
			
			sc.close();
		} 
		
	}
	public static void addAddress() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("insert into addressdb.addresses "
								+ "(id, street_id, number, apartmentNo)"
								+ "values(?,?,?,?)")) {
			
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("Enter id, street id, number, apartmentNo");
				int iD = sc.nextInt();
				int streetID = sc.nextInt();
				int number = sc.nextInt();
				int apartmentNo = sc.nextInt();
				
				ps.setInt(1, iD);
				ps.setInt(2, streetID);
				ps.setInt(3, number);
				ps.setInt(4, apartmentNo);
				
				ps.execute();
				System.out.println("Address inserted successfully.");
			} catch (InputMismatchException e) {
				System.out.println("Invalid data.");
			}
			
			
			sc.close();
		}
	}
	public static void getAddresses() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/addressdb", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select addresses.number, streets.name, "
								+ "addresses.apartmentNo, municipalities.name, "
								+ "populated_areas.name, region.name, countries.name from countries "
								+ "inner join region "
								+ "on countries.id = region.id " 
								+ "inner join populated_area_types "
								+ "on populated_area_types.id = region.id "
								+ "inner join populated_areas "
								+ "on populated_areas.id = region.id "
								+ "inner join municipalities "
								+ "on municipalities.id = region.id "
								+ "inner join streets "
								+ "on streets.id = region.id " 
								+ "inner join addresses "
								+ "on addresses.id = region.id where municipalities.name = ?")) {
			
			
			System.out.println("Enter manicipality name:");
			Scanner sc = new Scanner(System.in);
			String municipality = sc.nextLine();
			
			ps.setString(1, municipality);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
					System.out.printf(rs.getString(1) + ", " + rs.getString(2) + ", Ap. "
							+ rs.getString(3) + ", " + rs.getString(4) + ", "
							+ rs.getString(5) + ", " + rs.getString(6) + ", " + rs.getString(7));
	
			}
			sc.close();
		} 
		
	}
	
	
	
}
