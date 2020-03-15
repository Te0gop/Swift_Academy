package homework;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_NumberNotANumber{
	public static void main(String[] args) {
		final String END_OPERATOR = "END";
		Scanner sc = new Scanner(System.in);
		
		String currentLine = sc.nextLine();
		
		while (!END_OPERATOR.equals(currentLine)) {
			
			try {
				Integer.parseInt(currentLine);
				System.out.println("Number");
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Not a number");
			}
			
			currentLine = sc.nextLine();
		}
		
		sc.close();
	}

}
