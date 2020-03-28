import java.util.Scanner;

public class Task2a_PrintSumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbersCount = sc.nextInt();
		int lineOfNums = 0;
        int finalResult = 0;
		
		for (int i = 0; i < numbersCount; i++) {
			lineOfNums = sc.nextInt();
			finalResult += lineOfNums;
		}

		System.out.println(finalResult);
		sc.close();
		
	}

}
