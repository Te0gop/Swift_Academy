import java.util.Arrays;
import java.util.Scanner;

public class Task0b_ReadArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfElementsInArray = sc.nextInt();

		int[] numbersOfArray = new int[numberOfElementsInArray];

		
		for (int i = 0; i < numberOfElementsInArray; i++) {
			
			numbersOfArray[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(numbersOfArray));
		sc.close();
	}
	

}
