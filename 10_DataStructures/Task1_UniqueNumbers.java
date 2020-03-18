package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1_UniqueNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		int numbers = sc.nextInt();

		
		for (int i = 0; i < numbers; i++) {
			int members = sc.nextInt();
			
			if(i == 0) {
				list.add(members);
			}
			if(!(list.contains(members))) {
					list.add(members);
			}
		}
		for (Integer elements : list) {
			System.out.printf(elements + " ");
		}
		sc.close();
	}
	

}
