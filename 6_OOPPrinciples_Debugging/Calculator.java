package homework;

public class Calculator {
	
	public double sum;
	public double subtract;
	public double multiply;
	public double divide;
	public double percentage;
	
	public Calculator() {
		
	}
	
	public Calculator(double sum, double subtract, double multiply, double divide, double percentage) {
		super();
		this.sum = sum;
		this.subtract = subtract;
		this.multiply = multiply;
		this.divide = divide;
		this.percentage = percentage;
	}
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getSubtract() {
		return subtract;
	}
	public void setSubtract(double subtract) {
		this.subtract = subtract;
	}
	public double getMultiply() {
		return multiply;
	}
	public void setMultiply(double multiply) {
		this.multiply = multiply;
	}
	public double getDivide() {
		return divide;
	}
	public void setDivide(double divide) {
		this.divide = divide;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public double sumNumbers (double a, double b) {
		sum = a + b;
		System.out.printf("%.3f%n", sum);
		return sum;
	}
	public double subtractNums (double a, double b) {
		subtract = b - a;
		System.out.printf("%.3f%n", subtract);
		return subtract;
	}
	public double multiplyNums (double a, double b) {
		multiply = a * b;
		System.out.printf("%.3f%n", multiply);
		return multiply;
	}
	public double divideNums (double a, double b) {
		divide = a / b;
		System.out.printf("%.3f%n", divide);
		return divide;
	}
	public double percentNums (double a, double b) {
		percentage = (b * a )/ 100;
		System.out.printf("%.3f%n", percentage);
		return percentage;
	}

	
	


}
