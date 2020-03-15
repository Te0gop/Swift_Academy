
public class ExceptionDemo {
	public static void main(String[] args) {
		
		try {
			makesException();
		} catch (Exception e) {
			System.out.println("Exception accured " + e.getMessage());
		} finally {
			System.out.println("In finally");
		}
		
	}
	
	public static void makesException() {
		System.out.println("Devision: " + 3/0);
	}

}
