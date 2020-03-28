import java.util.Scanner;

public class Vehicle {

	public String type;
	public String model;
	public int power;
	public double fuelConsumption;
	public int yearProduced;
	public int licenseNo;
	public int weight;
	public String color;
	double fuelPrice;
	double distance;

	
	public Vehicle() {
		
	}
	
	public Vehicle(String type, String model, int power, int fuelConsumption, 
			int yearProduced, int licenseNo, int weight, String color) {
		super();
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNo = licenseNo;
		this.weight = weight;
		this.color = color;
	}
	
	public Vehicle(String type, String model, int power, int fuelConsumption, 
			int yearProduced, int licenseNo) {
		super();
		this.type = type;
		this.model = model;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
		this.yearProduced = yearProduced;
		this.licenseNo = licenseNo;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getYearProduced() {
		return yearProduced;
	}

	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {

		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getFuelPrice() {
		return fuelPrice;
	}

	public void setFuelPrice(double fuelPrice) {
		this.fuelPrice = fuelPrice;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	double calculateTripPrice (double fuelPrice, double distance) {
		double calculate = (fuelPrice * fuelConsumption * distance) / 100; 
		return calculate;
		
	}

	double getInsurancePrice() {

		double typeCoefficient = 0;
		
		switch (type) {
		case "car":
			typeCoefficient += 1.00;
			break;
		case "suv":
			typeCoefficient += 1.12;
			break;
		case "truck":
			typeCoefficient += 1.20;
			break;
		case "motorcycle":
			typeCoefficient += 1.50;
			break;
		}
		
		int carAge = 2016 - yearProduced;
		double insurance = ( 0.16 * power ) * (1.25 * carAge ) *
				( 0.05 * fuelConsumption ) * typeCoefficient;
		
		return insurance;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle car = new Vehicle();
		int number = 0;
		
		int numberOfCars = Integer.parseInt(sc.nextLine());
		double fuel = Double.parseDouble(sc.nextLine());
		
		for (int i = 0; i < numberOfCars; i++) {

			String[] inputData = sc.nextLine().split(", ");
			String[] arr = new String[inputData.length];
			
			for (int j = 0; j < inputData.length; j++) {
				arr[j] = inputData[j];
			}
			
			car.setFuelPrice(fuel);
			car.setType(arr[0]);
			car.setModel(arr[1]);
			car.setPower(Integer.parseInt(arr[2]));
			car.setFuelConsumption(Double.parseDouble(arr[3]));
			car.setYearProduced(Integer.parseInt(arr[4]));
			double distance = (Double.parseDouble(arr[5]));
			car.setDistance(distance);
			car.setLicenseNo(number);
			
			if (arr.length == 8) {
				
				car.setColor(arr[7]);
			} else if (car.getColor() == null) {
				car.setColor("N/A");
				
			}
			
			System.out.printf("%04d - %s, %d, %s%n", car.getLicenseNo(), car.getModel(), car.getYearProduced(), car.getColor());
			System.out.printf("Insurance cost: %.2f - Travel cost: %.2f%n", car.getInsurancePrice(), car.calculateTripPrice(fuel, distance));
			
			car.setColor(null);
			number++;

		}
		sc.close();
	}

}
