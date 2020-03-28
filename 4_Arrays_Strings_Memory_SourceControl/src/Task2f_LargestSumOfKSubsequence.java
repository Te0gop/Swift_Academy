import java.util.Arrays;
import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int elementsOfK = sc.nextInt();
		int elementsOfN = sc.nextInt();
		int[] arr = new int [elementsOfK];
		int[] highestSum = new int[elementsOfK];

		
		int highestSeq = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < highestSum.length / 2; i++) {
			
			int temp = 0;
			
			for (int j = i; j < elementsOfN; j++) {
				temp += arr[j];
				highestSum[j] = arr[j];
				
				if (temp > highestSeq) {
					highestSeq = 0;
					highestSeq = temp;
					
				}

			}
			elementsOfN++;
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(highestSeq);
		System.out.println(Arrays.toString(highestSum));
	}

}
