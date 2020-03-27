package homework;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task0b_FindFunnyCharacters {
	
	public static String checkCompilePattern(String p) {
		if(p.equals("[^\\s\\w~!@#$%^&*()_+-=/]")) {
			return "[^\\s\\w~!@#$%^&*()_+-=/]";
		}
		return p;
	}
	public static void main(String[] args) {
				
		String stringLine = "123, °, 1, 2, -1, 3.1, a, b, fsfgfd, ®, СТОЯН, њ, №, /, #, @, !";
		
		Pattern pattern = Pattern.compile(checkCompilePattern("[^\\s\\w~!@#$%^&*()_+-=/]"));
		Matcher matcher = pattern.matcher(stringLine);
		
		while(matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
	}
}
