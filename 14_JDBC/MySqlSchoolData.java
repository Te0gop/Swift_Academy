package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MySqlSchoolData {

	public static void insertTeacher() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("insert into teachers "
								+ "(teachers_id, teachers_name, teachers_email, teachers_salary)"
								+ "values(?,?,?,?);")) {
			
			Scanner sc = new Scanner(System.in);
			int id = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			String email = sc.nextLine();
			double salary = sc.nextDouble();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setDouble(4, salary);
			
			ps.execute();
			sc.close();
		}
	}
	public static void getTeacher() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from teachers where teachers_id = ?")) {
			
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
					System.out.println(rs.getString(2));
			}
			sc.close();
		} 
		
	}
	//Overload the method
	public static void getTeacher(int id) throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from teachers where teachers_id = ?")) {
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
					System.out.printf("Teacher " + rs.getString(2) + " teaches ");
			}

		} 
		
	}
	public static void getTeachers() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from teachers where "
								+ "teachers_salary > ? and teachers_salary < ?")) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the lower limit of salary.");
			int salaryX = sc.nextInt();
			System.out.println("Enter the upper limit of salary.");
			int salaryY = sc.nextInt();
			
			ps.setInt(1, salaryX);
			ps.setInt(2, salaryY);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
					System.out.printf("Person with salary in the set range is: " + rs.getString(2) + " with salary: " + rs.getString(4));
			}
			sc.close();
		} 
		
	}
	public static void insertStudent() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("insert into students "
								+ "(students_id, students_name, students_enrollment_date)"
								+ "values(?,?,?);")) {
			
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter student's id:");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter student's name:");
				String name = sc.nextLine();
				System.out.println("Enter student's enrollment date (year/month/day):");
				String enrollmentDate = sc.nextLine();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, enrollmentDate);
				ps.execute();
				System.out.println("Student is inserted successfully.");
			} catch (Exception e) {
				System.out.println("Student is not inserted. Student's data is not entered correctly.");
			}
			sc.close();
		}
	}
	public static void getStudent() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from students where students_id = ?")) {
			
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter student's id:");
				int id = sc.nextInt();
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
						System.out.printf("Student with that id is: " + rs.getString(2));
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Student not found. Enter student's id correctly.");
			}
			
			sc.close();
		} 
		
	}
	
	public static void getStudents() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from students where "
								+ "students_enrollment_date > ?")) {
			
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter student's enrollment date (year/month/day):");
				String enrollmentDate = sc.next();
				ps.setString(1, enrollmentDate);
				ResultSet rs = ps.executeQuery();
				getTeacher();
				while(rs.next()) {
					System.out.printf("Student: " + rs.getString(2) + " with enrollment date: " 
							+ rs.getString(3) + "\n");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Enrollment date is not valid. Enter enrollment date correctly.");
			}
			
			sc.close();
		} 
		
	}
	public static void getDisciplinesByTeacherId() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from disciplines "
								+ "where disciplines_id = ?")) {
			
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter teacher's id (number):");
				int teacherID = sc.nextInt();
				ps.setInt(1, teacherID);
				ResultSet rs = ps.executeQuery();
				
				getTeacher(teacherID);
				
				while(rs.next()) {
					System.out.printf(rs.getString(2) + "\n");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Invalid teacher's id.");
			}
			
			sc.close();
		} 
		
	}
	public static void getTeachersByDisciplineName() throws SQLException {
		try(Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/school", "root", "123456789");
				PreparedStatement ps =
						con.prepareStatement("select * from disciplines "
								+ "where disciplines_name = ?")) {
			
			Scanner sc = new Scanner(System.in);

				System.out.println("Enter school subject:");
				String disciplineName = sc.next();
				ps.setString(1, disciplineName);
	
				ResultSet rs = ps.executeQuery();

				while(rs.next()) {
					getTeacher(rs.getInt(1));
					System.out.println(rs.getString(2));
				}
				
			sc.close();
		} 
		
	}
	
	
	
}
