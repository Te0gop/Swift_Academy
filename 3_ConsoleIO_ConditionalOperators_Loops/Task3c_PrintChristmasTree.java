import java.util.Scanner;

public class Task3c_PrintChristmasTree {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int christmassTreeLenght = sc.nextInt();

	for (int i = 0; i < christmassTreeLenght; i++) {
		for (int j = 0; j < christmassTreeLenght - i; j++) 
			System.out.print(" ");
			for (int k = 0; k < (2 * i + 1); k++) 
				System.out.print("*");
				System.out.println();
		}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < christmassTreeLenght - i; j++) 
			System.out.print(" ");
			for (int k = 0; k < (2 * i + 1); k++) 
				System.out.print("*");
				System.out.println();
		}

	sc.close();
	}
}
