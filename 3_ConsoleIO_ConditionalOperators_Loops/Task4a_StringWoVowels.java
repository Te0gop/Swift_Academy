import java.util.Scanner;

public class Task4a_StringWoVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String stringWithVowels = sc.nextLine();

		for (int i = 0; i < stringWithVowels.length(); i++) {
			
			char sentenceWithoutVowels = stringWithVowels.charAt(i);
			
			switch (sentenceWithoutVowels) {
			
			case 'a':
			case 'e':
			case 'o':
			case 'u':
			case 'i':
			case 'A':
			case 'O':
			case 'U':
			case 'E':
			case 'I':
				sentenceWithoutVowels++;
				break;
			case ' ':
				System.out.print(' ');
				break;
			default:
				System.out.print(sentenceWithoutVowels);
				break;
			}	
		}
		sc.close();
	}

}
