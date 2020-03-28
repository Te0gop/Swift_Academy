package UniversityManagement;

public abstract class Employee {

	public String name;
	public String cellPhone;
	public int salaryPerHour;
	public int patience = 20;
	

	
	public Employee(String name, String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}
	public Employee() {
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public int getSalaryPerHour() {
		return salaryPerHour;
	}
	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}
	public int getPatience() {
		return patience;
	}
	public void setPatience(int patience) {
		this.patience = patience;
	}
	
	
	public abstract void work();
	
	public abstract void idle();
}
