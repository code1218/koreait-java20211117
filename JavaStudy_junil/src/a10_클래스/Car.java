package a10_클래스;

public class Car {
	// 레퍼런스 변수(참조 변수)
	private String company; //제조사
	private String model; //차량 모델명
	private String color; //차량 색상
	private int year; //연식
	
	//getter(가져올때) && setter(값을대입)
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void carInfo() {
		System.out.println(company + ", " + model + ", " + color + ", " + year);
	}
}
