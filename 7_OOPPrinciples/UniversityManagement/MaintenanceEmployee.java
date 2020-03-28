package UniversityManagement;

public class MaintenanceEmployee extends Employee {
	public int salary = 15;
	Employee maint = new MaintenanceEmployee();
	Employee teach = new Teacher();
	Employee admin = new AdministrationEmployee();
	Employee stud = new Student();
	
	@Override
	public void work() {
		stud.setPatience(patience + 2);
		teach.setPatience(patience + 2);
		admin.setPatience(patience + 2);
		stud.setPatience(patience + 2);
	}

	@Override
	public void idle() {
		// TODO Auto-generated method stub
		
	}
}
