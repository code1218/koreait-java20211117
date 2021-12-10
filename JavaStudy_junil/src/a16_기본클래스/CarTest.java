package a16_기본클래스;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(20210001, "k5");
		Car car2 = new Car(20210001, "k5");
		Car car3 = new Car(20210003, "k7");
		Car car4 = new Car(20210004, "k7");
		
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
		System.out.println(car1.hashCode());
	}
}
