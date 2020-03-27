package homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class JUnitTests {
	
	@Test
	public void checkPatternValueOfRegex_FindIntegers() {

		assertEquals("-?\\d+", Task0a_FindIntegers.checkCompilePattern("-?\\d+"));
	}
	
	@Test
	public void checkPatternValueOfRegex_FindFunnyCharacters() {

		assertEquals("[^\\s\\w~!@#$%^&*()_+-=/]", Task0b_FindFunnyCharacters
				.checkCompilePattern("[^\\s\\w~!@#$%^&*()_+-=/]"));
	}
	
	@Test
	public void checkPatternValueOfRegex_IsCorrectSQLInsert() {

		assertEquals("(insert)\\s(into)\\s([a-zA-Z])+\\s\\(([a-zA-Z]+))"
				+ "\\_([a-zA-Z]+)\\)\\s(values)\\s+(\\(\\\")+([a-zA-Z])*\\\"\\)\\;" ,
				    Task0c_IsCorrectSQLInsert.checkCompilePattern("(insert)\\s(into)\\s([a-zA-Z])+\\s\\(([a-zA-Z]+))"
				+ "\\_([a-zA-Z]+)\\)\\s(values)\\s+(\\(\\\")+([a-zA-Z])*\\\"\\)\\;"));
	}


}
