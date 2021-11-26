package a10_Å¬·¡½º;

public class StudentTest {

	public static void main(String[] args) {
		new Student();
		new Student();
		new Student();
		new Student();
		Student s1 = new Student(3, 1, 10, "±èÁØÀÏ");
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.studentGroup = 5;
		
		s1.showInfo();
		/*
		System.out.println(s1);
		
		s1.studentYear = 3;
		s2.studentYear = 2;
		s3.studentYear = 2;
		s4.studentYear = 1;
		
		s1.studentGroup = 1;
		s1.studentNumber = 1;
		s1.name = "±èÁØÀÏ";
		
		s2.studentGroup = 3;
		s2.studentNumber = 5;
		s2.name = "±èÁØÀÌ";
		
		s3.studentGroup = 2;
		s3.studentNumber = 8;
		s3.name = "±èÁØ»ï";
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "Çö´ëÀÚµ¿Â÷";
		c1.model = "½î³ªÅ¸";
		c1.color = "°ËÁ¤";
		c1.year = 2021;
		
		c1.carInfo();
		*/
	}

}
