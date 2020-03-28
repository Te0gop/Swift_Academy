import java.util.Scanner;

public class Task3b_PrintZFigure {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int lenghtOfZ = sc.nextInt();
	int displacement = lenghtOfZ;
	
	for (int i = 1; i <= lenghtOfZ; i++) {
		
		if (i == 1) {
			
			for (int firstLine = 1; firstLine <= lenghtOfZ; firstLine++) {
				System.out.print("* ");
			}
		} else if (i > 0 && i < lenghtOfZ) {
			
			displacement--;
			
			for (int nextLine = 1; nextLine <= lenghtOfZ; nextLine++) {
				
				
				if (nextLine != displacement) {
					System.out.print("  ");
				} else {
					System.out.print("*");
				}
				
		     } 

		} else {
			
			for (int lastLine = 1; lastLine <= lenghtOfZ; lastLine++) {
				System.out.print("* ");
			}

		}
		System.out.println();
		sc.close();
	}
	
	
	}
}
