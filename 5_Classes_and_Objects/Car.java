
public class Car {
	
	public String brand, model;
	public int horsePower;
	public int yearOfManifacture;
	public double money;
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public int getYear() {
		return yearOfManifacture;
	}
	public double getMoney() {
		return money;
	}
	
	public void insuranceCategory() {
		yearOfManifacture = 2020 - yearOfManifacture;
		
		if (yearOfManifacture >= 1 && yearOfManifacture <= 8) {
			money += 150;
		} else if (yearOfManifacture >= 8 && yearOfManifacture <= 15) {
			money += 200;
		} else if (yearOfManifacture >= 15 && yearOfManifacture <= 25) {
			money += 300;
		} else if (yearOfManifacture > 25) {
			money += 500;
		}
	}
	
	public double debtMoney() {
		if (horsePower < 80) {
			money *= 1.20;
		} else if (horsePower > 140) {
			money *= 1.45;
		}
		return money;
	}
	
	public Car(String brand, String model, int yearOfManifacture, int horsePower) {
		this.brand = brand;
		this.model = model;
		this.yearOfManifacture = yearOfManifacture;
		this.horsePower = horsePower;

	}

	public static void main(String[] args) {
		
		
		Car Mercedes = new Car("Mercedes-Benz", "S220", 2012, 160);
		Car Lada = new Car("Lada", "5", 1989, 75);
		
		Mercedes.insuranceCategory();
		Lada.insuranceCategory();
		System.out.println(Mercedes.debtMoney());
		System.out.println(Lada.debtMoney());
		
	}

}
