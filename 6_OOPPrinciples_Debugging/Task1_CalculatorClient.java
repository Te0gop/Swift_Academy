package homework;

import java.util.Scanner;

public class Task1_CalculatorClient extends Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator calculations = new Calculator();
		
		String operation = sc.next();
		
		
		while (!operation.equals("END")) {
			
			double numberForA = sc.nextDouble();
			double numberForB = sc.nextDouble();
			
			if (operation.equals("SUM")) {
				calculations.sumNumbers(numberForA, numberForB);
			} else if (operation.equals("SUB")) {
				calculations.subtractNums(numberForA, numberForB);
			} else if (operation.equals("MUL")) {
				calculations.multiplyNums(numberForA, numberForB);
			} else if (operation.equals("DIV")) {
				calculations.divideNums(numberForA, numberForB);
			} else if (operation.equals("PER")) {
				calculations.percentNums(numberForA, numberForB);
			} 
			
			operation = sc.next();
		}

		sc.close();
		
	}

}
