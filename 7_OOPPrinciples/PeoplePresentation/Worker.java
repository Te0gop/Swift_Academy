package homework;

public class Worker extends Task1_PeoplePresentation{
	public int weekSalary;
	public int workHoursPerDay;
	public double salaryPerHour;
	
	public int getWeekSalary() {
		return weekSalary;
	}
	public void setWeekSalary(int weekSalary) {
		this.weekSalary = weekSalary;
	}
	public int getWorkHoursPerDay() {
		return workHoursPerDay;
	}
	public void setWorkHoursPerDay(int workHoursPerDay) {
		this.workHoursPerDay = workHoursPerDay;
	}
	
	public double salary() {
		salaryPerHour = weekSalary / 5;
		salaryPerHour /= workHoursPerDay;
		
		return salaryPerHour;
	}

}
