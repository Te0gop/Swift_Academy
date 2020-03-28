import java.util.Scanner;

public class Task1d_PrintAllDivisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberForDivision = sc.nextInt();

		
		for (int i = 1; i <= numberForDivision; i++) {
			
			if (numberForDivision % i == 0) {
				System.out.printf("%d ", i);
			}
			
		}
	    //int divisionCounter = 1;
	    
		//while (numberForDivision >= divisionCounter) {
			
		//	if (numberForDivision % divisionCounter == 0) {
		//		System.out.printf("%d ", divisionCounter);
		//	}
		//	divisionCounter++;
		//}
				
		sc.close();

	}

}
