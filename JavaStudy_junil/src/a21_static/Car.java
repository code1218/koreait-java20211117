package a21_static;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
	private int serialNum;
	private String model;
	
	public void carInfo() {
		System.out.println("차량 시리얼 번호: " + serialNum);
		System.out.println("차량 모델: " + model);
	}
	
}
