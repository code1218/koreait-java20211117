package a11_Å¬·¡½º2;

public class Rule {

	public boolean isEmpty(String str) {
		if(str == null || str.equals("")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty(int number) {
		if(number == 0) {
			return true;
		}else {
			return false;
		}
	}
}
