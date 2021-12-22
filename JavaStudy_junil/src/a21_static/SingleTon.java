package a21_static;

public class SingleTon {

	public static void main(String[] args) {
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		
		Car car1 = factory1.createCar("k3");
		Car car2 = factory2.createCar("k5");
		Car car3 = factory3.createCar("k7");
		Car car4 = factory4.createCar("k8");
		
		car1.carInfo();
		car2.carInfo();
		car3.carInfo();
		car4.carInfo();
		

	}

}
