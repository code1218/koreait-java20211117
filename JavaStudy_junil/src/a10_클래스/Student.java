package a10_클래스;

public class Student {
	public int studentYear;
	public int studentGroup;
	private int studentNumber;
	String name;
	
	public Student() {
		
	}
	
	public Student(int studentYear, int studentGroup, int studentNumber, String name) {
		this.studentYear = studentYear;
		this.studentGroup = studentGroup;
		this.studentNumber = studentNumber;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("학년: " + studentYear);
		System.out.println("반: " + studentGroup);
		System.out.println("번호: " + studentNumber);
		System.out.println("이름: " + name);
		System.out.println();
	}
}
