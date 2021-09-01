package inheritance.downcasting;

import java.util.ArrayList;

// 상위클래스
class Animal {
	public void show() {
		System.out.println("동물 입니다.");
	}
}

// 하위클래스
class Human extends Animal {
	@Override
	public void show() {
		System.out.println("사람 입니다");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void show() {
		System.out.println("호랑이 입니다");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void show() {
		System.out.println("독수리 입니다");
	}
	public void flying() {
		System.out.println("독수리는 날아다닙니다.");
	}
}


public class AnimalTest {
	// 다운캐스팅 구현
	public void animalAction(ArrayList<Animal> animalList) {
		for(int i = 0; i < animalList.size(); i++) {
			System.out.println("animalAction");
			if (animalList.get(i) instanceof Human) {
				Human humanDown = (Human)animalList.get(i);
				humanDown.readBook();
			}
			else if (animalList.get(i) instanceof Tiger) {
				Tiger tigerDown = (Tiger)animalList.get(i);
				tigerDown.hunting();
			}
			else if (animalList.get(i) instanceof Eagle) {
				Eagle eagleDown = (Eagle)animalList.get(i);
				eagleDown.flying();
			}
		}
	}
	// main
	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		Human humanDown = (Human)human;
		humanDown.readBook();
		
//		Human eggleDown = (Human)eagle; // eagle변수는 Eagle클래스로 생성되었는데 Human클래스형으로 다운캐스팅함
		if (eagle instanceof Human) { // false로 실행되지 않음
			Human eggleDown = (Human)eagle;
			eggleDown.readBook();
			System.out.println("eggleDown입니다");
		}
		
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		AnimalList.add(human);
		AnimalList.add(tiger);
		AnimalList.add(eagle);
		
		// 다운캐스팅 실행
		AnimalTest test = new AnimalTest();
		test.animalAction(AnimalList);
	}
}
