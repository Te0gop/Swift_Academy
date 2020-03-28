import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
			int numbersCount = sc.nextInt();
			int[] numbersArray = new int[numbersCount];
			
			for (int i = 0; i < numbersCount; i++) {
				numbersArray[i] = sc.nextInt();
			}
			for (int i = 0; i < numbersArray.length; i++) {
				
				if (numbersArray[i] % 2 == 0) {
					System.out.print(numbersArray[i] + " ");
				}
				
			}
	
		sc.close();
	}

}
