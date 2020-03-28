import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String digitsAndNumbers = sc.nextLine();

		int sum = 0;

		for(int i = 0; i < digitsAndNumbers.length(); i++) {
		    if(Character.isDigit(digitsAndNumbers.charAt(i))) {
		        sum = sum + Integer.parseInt(digitsAndNumbers.charAt(i) + "");
		    } 
		}
		sc.close();
		System.out.println(sum);
				
		}
		
	}

