import java.util.Scanner;

public class Task4b_PrintCountOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		int wordsCounter = 1;

		for (int i = 0; i < sentence.length(); i++) {
			
			char words = sentence.charAt(i);
			
			if (words >= 'a' && words <= 'z') {
				continue;
			} else if (words >= 'A' && words <= 'Z' ) {
				continue;
			} else if (words == ' ') {
				wordsCounter++;
			} else if (words == '\'' || words == ',' || words == '.' || words == '?' || words == '!' || words == ';' || words == ':') {
				continue;
			}
			else {
				wordsCounter--;
			}
		
		}
		System.out.println(wordsCounter);
		sc.close();
	}

}
