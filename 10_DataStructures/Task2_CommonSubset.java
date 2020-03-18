package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_CommonSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nNums = sc.nextInt();
		int mNums = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> matchingNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < nNums; i++) {
			int members = sc.nextInt();
			list.add(members);
		}
		
		for (int i = 0; i < mNums; i++) {
			int members = sc.nextInt();
			
			if(list.contains(members)) {
				matchingNumbers.add(members);
			}
			
		}
		if(matchingNumbers.isEmpty()) {
			System.out.println("NO");
		} 
		for (Integer el : matchingNumbers) {
			System.out.printf(el + " ");
		}
		
		sc.close();
	}
}
