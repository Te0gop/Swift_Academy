package homework;

import java.util.Scanner;
import java.util.Stack;

public class Task3_ParenthesesMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String braces = sc.nextLine();
		System.out.println(isMatching(braces));
		sc.close();
	}
	
	public static boolean isMatching(String string) {
		if(string.charAt(0) == '}' || string.charAt(0) == ')' || string.charAt(0) == ']') {
			return false;
		}

	    Stack<Character> stack = new Stack<Character>();
	    

	    char c;
	    for(int i = 0; i < string.length(); i++) {
	        c = string.charAt(i);

	        if(c == '(') {
	            stack.push(c);
	        } else if(c == '{') {
	            stack.push(c);
	        } else if(c == '[') {
	        	stack.push(c);
	        } else if(c == ')') {
	            if(stack.empty()) {
	                return false;
	            } else if(stack.peek() == '(') {
	                stack.pop();
	            } else {
	                return false;
	            }
	        } else if(c == '}') {
	            if(stack.empty()) {
	                return false;
	            } else if(stack.peek() == '{') {
	                stack.pop();
	            } else {
	                return false;
	            }
	        } else if(c == ']' ) {
	        	if(stack.empty()) {
	        		return false;
	        	} else if(stack.peek() == '[') {
	        		stack.pop();
	        	} else {
	        		return false;
	        	}
	        }
	    }
	    return stack.empty();
	}

}
