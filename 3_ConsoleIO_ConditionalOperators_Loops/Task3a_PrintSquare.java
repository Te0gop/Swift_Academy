import java.util.Scanner;

public class Task3a_PrintSquare {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lenghtOfSquare = sc.nextInt();
		
		for (int i = 1; i <= lenghtOfSquare; i++) {
			
			if (i == 1) {
				
				for (int firstLine = 1; firstLine <= lenghtOfSquare; firstLine++) {
					System.out.print("* ");
				}
			} else if (i > 0 && i < lenghtOfSquare) {
				
				for (int nextLine = 1; nextLine <= lenghtOfSquare; nextLine++) {
					
					if (nextLine == 1 || nextLine == lenghtOfSquare) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

			     } 
			} else {
				
				for (int lastLine = 1; lastLine <= lenghtOfSquare; lastLine++) {
					System.out.print("* ");
				}

			}
			System.out.println();
			sc.close();
		}
		
	}

}
