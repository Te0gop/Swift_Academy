import java.util.Scanner;

public class Task0c_PrintString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arrayOfString = sc.next();
		
		for (int i = 0; i < arrayOfString.length(); i++) {
			System.out.println(arrayOfString.charAt(i)); 

		}
		sc.close();
	}

}
