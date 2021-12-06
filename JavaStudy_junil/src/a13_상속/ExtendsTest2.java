package a13_상속;

public class ExtendsTest2 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human("김준일");
		animals[1] = new Tiger("호돌이");
		animals[2] = new Eagle("독수리");
		
		int i = 0;
		
		for(Animal animal: animals) {
			if(i == 0) {
				i++;
				continue;
			}
			/* 1.
			if(animal == animals[0]) {
				continue;
			}
			*/
			
			System.out.println("이름: " + animal.get이름());
			System.out.println("종류: " + animal.get종류());
			
			if(animal instanceof Human) {
				Human h = (Human)animal;
				System.out.println("마음: " + h.get마음());
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				System.out.println("사냥능력: " + t.get사냥능력());
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				System.out.println("날개길이: " + e.get날개길이());
			}
			i++;
			
		}
		
		
		
	}

}






