package a16_기본클래스;

import java.util.Objects;

public class Car {
	private int carNumber;
	private String model;
	
	public Car(int carNumber, String model) {
		this.carNumber = carNumber;
		this.model = model;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(carNumber, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return carNumber == other.carNumber && Objects.equals(model, other.model);
	}

	/*
	@Override
	public int hashCode() {
		return this.carNumber;
	}

	@Override
	public boolean equals(Object obj) {
		Car car = (Car)obj;
		if(this.model.equals(car.getModel()) && this.hashCode() == car.hashCode()) {
			return true;
		}else {
			return false;
		}
	}
	*/
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", model=" + model + "]";
	}
	
}
