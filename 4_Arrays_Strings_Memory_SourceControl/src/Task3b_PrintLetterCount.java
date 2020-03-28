import java.util.Scanner;

public class Task3b_PrintLetterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String wordToCheck = sc.nextLine().toLowerCase();
		char[] array = wordToCheck.toCharArray();
		int counter = 1;
		boolean repeat = false;
		char[] repLetters = new char[array.length];

		
		for (int firstIndex = 0; firstIndex < array.length; firstIndex++) {
			repLetters[firstIndex] = array[firstIndex];
			
			for (int secondIndex = firstIndex+1; secondIndex < array.length; secondIndex++) {
				
				if (array[firstIndex] == array[secondIndex]) {

					counter++;
					repeat = true;
					}

				}

			if (counter > 1 && repeat) {
				System.out.print(array[firstIndex]);
				System.out.printf("(%d) ", counter);
				counter = 1;
			} else {
				System.out.print(array[firstIndex]);
				System.out.printf("(%d) ", counter);
			}
			repeat = false;

		}
		sc.close();
		
		
	}

}
