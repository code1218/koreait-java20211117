package a11_클래스2;

/**
 * 
 * @author ITPS
 *
 */

public class RuleTest {

	public static void main(String[] args) {
		Rule rule = new Rule();
		
		String name = "김준일";
		String addr = "부산광역시 동래구";
		int year = 2021;
		
		if(rule.isEmpty(name)) {
			System.out.println("이름이 비어있습니다.");
		}else {
			System.out.println("사용자의 이름은 " + name + "입니다.");
		}
		
		if(rule.isEmpty(addr)) {
			System.out.println("주소가 비어있습니다.");
		}else {
			System.out.println("사용자의 주소는 " + addr + "입니다.");
		}
		
		if(rule.isEmpty(year)) {
			System.out.println("년도를 입력해 주세요.");
		}else {
			System.out.println("입력한 년도는 " + year + "년 입니다.");
		}
		

	}

}
