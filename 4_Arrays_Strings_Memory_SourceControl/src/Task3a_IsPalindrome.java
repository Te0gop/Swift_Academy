import java.util.Arrays;
import java.util.Scanner;

public class Task3a_IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palindromWord = sc.nextLine();
		char[] reverseWordArray = palindromWord.toCharArray();
		char[] originalWord = Arrays.copyOf(reverseWordArray, reverseWordArray.length);
		
		for (int i = 0; i < reverseWordArray.length / 2; i++) {
			reverseWordArray[i] = reverseWordArray[reverseWordArray.length - 1 - i];
		}
		if(Arrays.equals(reverseWordArray, originalWord)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		sc.close();

	}

}
