package homework;

public class Student extends Task1_PeoplePresentation {
	
	String facultyNumber;
	int lecturyCount;
	int exerciseCount;
	double hoursPerDay;
	
	public String getFacultyNumber() {
		return facultyNumber;
	}
	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}
	public int getLecturyCount() {
		return lecturyCount;
	}
	public void setLecturyCount(int lecturyCount) {
		this.lecturyCount = lecturyCount;
	}
	public int getExcerciseCount() {
		return exerciseCount;
	}
	public void setExcerciseCount(int excerciseCount) {
		this.exerciseCount = excerciseCount;
	}
	
	
	public double hoursPerDay() {
		hoursPerDay = (lecturyCount * 2) + (exerciseCount * 1.5);
		hoursPerDay /= 5;
		return hoursPerDay;
	}
	
	

}
