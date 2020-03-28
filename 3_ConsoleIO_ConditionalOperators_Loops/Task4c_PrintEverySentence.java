import java.util.Scanner;

public class Task4c_PrintEverySentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		boolean hasBeginingSpace = false;


		for (int i = 0; i < sentence.length(); i++) {
			
			char diffrentLines = sentence.charAt(i);
			
			if (hasBeginingSpace) {
				if (diffrentLines != ' ') {
					System.out.print(diffrentLines);
				} else {
					hasBeginingSpace = false;
					System.out.println();
				}
				
			} else if (diffrentLines == '.') {
				System.out.print(diffrentLines);
				hasBeginingSpace = true;
			} else {
				System.out.print(diffrentLines);
			}
		}
		sc.close();
		
	}

}
