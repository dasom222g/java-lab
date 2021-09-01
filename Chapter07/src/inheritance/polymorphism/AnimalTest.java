package inheritance.polymorphism;

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
}

class Rabbit extends Animal {
	@Override
	public void show() {
		System.out.println("토끼 입니다");
	}
}

class Eggle extends Animal {
	@Override
	public void show() {
		System.out.println("독수리 입니다");
	}
}


public class AnimalTest {
	// 다형성
	public void showAnimal(Animal animal) {
		System.out.print("이것의 형태는 ");
		animal.show();
	}
	// main
	public static void main(String[] args) {
		Animal human = new Human();
		Animal rabbit = new Rabbit();
		Animal eggle = new Eggle();
//		human.show();
//		rabbit.show();
//		eggle.show();
		AnimalTest main = new AnimalTest();
		main.showAnimal(human);
		main.showAnimal(rabbit);
		main.showAnimal(eggle);
	}
}
