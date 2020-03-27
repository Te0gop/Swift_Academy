package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0a_FindIntegers {
	
	public static String checkCompilePattern(String p) {
		if(p.equals("-?\\d+")) {
			return "-?\\d+";
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		String stringLine = "123456, 1, 2, 3, -1, -2, -3, 3.1, 5.4, 13.2, a, b, c, d, e, fsfgfd";
		
		Pattern pattern = Pattern.compile(checkCompilePattern("-?\\d+"));
		Matcher matcher = pattern.matcher(stringLine);
		
		
		while(matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
		
	}

}
