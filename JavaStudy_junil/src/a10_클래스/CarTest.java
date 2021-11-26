package a10_클래스;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCompany("현대자동차");
		
		String company = c1.getCompany();
		
		System.out.println(company);

	}

}
