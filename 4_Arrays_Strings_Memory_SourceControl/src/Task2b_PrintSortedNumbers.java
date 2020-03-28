import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbersCount = sc.nextInt();
		int[] lineOfNums = new int[numbersCount];
		
		for (int i = 0; i < lineOfNums.length; i++) {
			lineOfNums[i] = sc.nextInt();

		}
		Arrays.sort(lineOfNums);
		System.out.print(Arrays.toString(lineOfNums));
		sc.close();
		
	}

}
