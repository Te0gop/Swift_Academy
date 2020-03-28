import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfTimes = sc.nextInt();
		
		int[] arr = new int[numberOfTimes];

		int[] arrSequence = new int[numberOfTimes];

		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < arrSequence.length; i++) {
			
			if (arr[i] > arr[i-1]) { 
				arrSequence[i] = arrSequence[i-1] +1;
			}
		}
		
		int maxNum = 0;
		int minNum = 0;
		int counter = 0;
		boolean firstIndex = false;

		for (int i = 0; i < arrSequence.length; i++) {
			
			if (maxNum < arrSequence[i]) {
				maxNum = arrSequence[i];
				counter = i;
				if (!firstIndex) {
					minNum = i-1;
					firstIndex = true;
			}
		}
			
	}

		while (minNum <= counter) {
			
		System.out.printf(arr[minNum] + " ");
		minNum++;
		
		}
		sc.close();


	}
	
}


