package homework;

import java.sql.SQLException;
import java.util.Scanner;

public class Task1_School extends MySqlSchoolData {
	public static void main(String[] args) throws SQLException {
		
		System.out.printf("Enter one of the following commands: %n"
				+ "insertTeacher, getTeacher, getTeachers, insertStudent, getStudent, %n"
				+ "getStudents, getDisciplinesByTeacherId or getTeachersByDisciplineName. %n");
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		
		if(command.equals("insertTeacher")) {
			insertTeacher();
		} else if (command.equals("getTeacher")) {
			getTeacher();
		} else if (command.equals("getTeachers")) {
			getTeachers();
		} else if (command.equals("insertStudent")) {
			insertStudent();
		} else if (command.equals("getStudent")) {
			getStudent();
		} else if (command.equals("getStudents")) {
			getStudents();
		} else if (command.equals("getDisciplinesByTeacherId")) {
			getDisciplinesByTeacherId();
		} else if (command.equals("getTeachersByDisciplineName")) {
			getTeachersByDisciplineName();
		} else {
			System.out.println("Invalid command.");
		}
		sc.close();
	}

}
