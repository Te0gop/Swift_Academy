
import java.util.Scanner;

public class Task2c_PrintClusterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbersCount = sc.nextInt();
		int[] lineOfNums = new int[numbersCount];
		int counter = 0;
		boolean repeat = false;
		int temp = lineOfNums[0];
		
		for (int i = 0; i < lineOfNums.length; i++) {
			lineOfNums[i] = sc.nextInt();
			
			if (temp == lineOfNums[i] && !repeat) {
				temp = lineOfNums[i];
				counter++;
				repeat = true;
			} else if (temp != lineOfNums[i]) {
				repeat = false;
				temp = lineOfNums[i];
			}

		}
		System.out.print(counter);
		sc.close();
	}

}
