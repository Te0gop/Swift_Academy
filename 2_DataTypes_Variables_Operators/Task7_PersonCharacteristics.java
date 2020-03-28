package bg.swift;

public class Task7_PersonCharacteristics {
	public static void main(String[] args) {
		String firstName = "Georgi";
		String lastName = "Georgiev";
		short dateOfBirth = 2002;
		float weight = 48.3f;
		short height = 156;
		String profession = "student";
		
		byte calculatedDateOfBirth = (byte) (2020 - dateOfBirth); // oldest person ever lived died at the age of 122. :)
		
		System.out.println(firstName + " " + lastName + " is " + calculatedDateOfBirth + " years old. His weight is " + weight + " and he is " + height + " cm tall. He is a " + profession + ".");
	}

}
