import java.util.Scanner;

public class Task2b_PrintReversedSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbersCount = sc.nextInt();
		int[] numbersArray = new int[numbersCount];
		
		for (int i = 0; i < numbersCount; i++) {
			numbersArray[i] = sc.nextInt();
		}
		for (int i = numbersArray.length - 1; i >= 0; i--) {
			System.out.print(numbersArray[i] + " ");
			
		}
	
		sc.close();
	}

}
