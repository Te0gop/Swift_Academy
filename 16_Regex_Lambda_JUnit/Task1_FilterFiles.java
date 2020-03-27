package homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1_FilterFiles {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		int numOfStrings = sc.nextInt();
		
		for (int i = 0; i < numOfStrings; i++) {
			String line = sc.next();	
			
			list.add(line);
		}
		List<String> images = list
			.stream()
			.filter(g -> g.contains(".gif") || g.contains(".png") || g.contains(".jpg") || g.contains(".bmp"))
			.filter(f -> f.endsWith(".gif") || f.endsWith(".png") || f.endsWith(".jpg") || f.endsWith(".bmp"))
			.collect(Collectors.toList());

		
		for (String el : images) {
			String line = el.replace(".", " ");
			System.out.println(line);
		}

		sc.close();
	}

}
