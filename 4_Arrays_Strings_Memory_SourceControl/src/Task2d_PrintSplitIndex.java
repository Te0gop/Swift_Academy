import java.util.Scanner;

public class Task2d_PrintSplitIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfTimes = sc.nextInt();
		int[] arr = new int[numberOfTimes];
		int collection = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (collection == arr[i]) {
				System.out.println(arr[i]);
			} else {
				System.out.println("NO");
			}
			collection += arr[i];
			
		}
		sc.close();
	}

}
