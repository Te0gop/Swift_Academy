import java.util.ArrayList;

import java.util.Scanner;

public class Employee {

	public String name;
	public float salary;
	public String position;
	public String department;
	public int age;
	public String email;

	public Employee() {
		
	}

	
	public Employee(String name, float salary, String position, String department, int age, String email) {
		super();
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.age = age;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee person = new Employee();
		
		int peopleToCheck = Integer.parseInt(sc.nextLine());

		
		for (int firstLoop = 0; firstLoop < peopleToCheck; firstLoop++) {
			
			String[] employeeData = sc.nextLine().split(", ");
			String[] arr = new String[employeeData.length];
			
			ArrayList<Employee> list = new ArrayList<Employee>();
			//Need little help to put arrays in list and compare them 
			
			for (int secondLoop = 0; secondLoop < employeeData.length; secondLoop++) {
				arr[secondLoop] = employeeData[secondLoop];
			}
			
			
			person.setName(arr[0]);
			person.setDepartment(arr[3]);
			person.setPosition(arr[2]);
			list.add(person);


			System.out.printf("%s, %s, %s", person.getName(), person.getDepartment(), person.getPosition());
			
			if (employeeData.length == 6) {
				person.setEmail(arr[5]);
				System.out.printf(", %s%n", person.getEmail());
			}
			//	System.out.println(Arrays.toString(employeeData));
			
		}

		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
		
}
	
	
	
	
	


	
