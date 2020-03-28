import java.util.Scanner;

public class Task1e_IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeOrNotPrimeNum = sc.nextInt();
		sc.close();
		
		boolean isPrime = true;
		
		for (int i = 2; i <= primeOrNotPrimeNum / 2; i++) {
			

			if (primeOrNotPrimeNum % i == 0) {
				isPrime = false;
				break;
			}
			
		}
			System.out.println(isPrime);

		
	}

}
