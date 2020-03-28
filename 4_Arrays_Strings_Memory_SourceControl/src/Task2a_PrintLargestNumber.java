import java.util.Scanner;

public class Task2a_PrintLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbersCount = sc.nextInt();
		int[] lineOfNumbers = new int[numbersCount];
		int biggestNumber = lineOfNumbers[0];
		
		for (int i = 0; i < numbersCount; i++) {
			lineOfNumbers[i] = sc.nextInt();
			
			if (lineOfNumbers[i] > biggestNumber) {
				biggestNumber = lineOfNumbers[i];
			}

		}
		System.out.println(biggestNumber);
		sc.close();
	}

}
