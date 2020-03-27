package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0c_IsCorrectSQLInsert {
	
	public static String checkCompilePattern(String p) {
		String command = "(insert)\\s(into)\\s([a-zA-Z])+\\s\\(([a-zA-Z]+)"
				+ "\\_([a-zA-Z]+)\\)\\s(values)\\s+(\\(\\\")+([a-zA-Z])*\\\"\\)\\;";
		if(p.equals(command)) {
			return command;
		}
		return p;
	}

	public static void main(String[] args) {
		
		
		String line = "insert into teachers (teachers_name) values (\"Stoyan\");";
		String command = "(insert)\\s(into)\\s([a-zA-Z])+\\s\\(([a-zA-Z]+)"
		+ "\\_([a-zA-Z]+)\\)\\s(values)\\s+(\\(\\\")+([a-zA-Z])*\\\"\\)\\;";
		
		Pattern pattern = Pattern.compile(checkCompilePattern(command));
		Matcher matcher = pattern.matcher(line);
		
		boolean isFind = false;
		
		while(matcher.find()) {
			if(matcher.matches()) {
				System.out.printf(matcher.group() + "\nInserted successful.");
				isFind = true;
			}
		}
		if(!isFind) {
			System.out.println("Operation failed.");
		}
		
	}

}
