package inheritance.polymorphism;

// ����Ŭ����
class Animal {
	public void show() {
		System.out.println("���� �Դϴ�.");
	}
}

// ����Ŭ����
class Human extends Animal {
	@Override
	public void show() {
		System.out.println("��� �Դϴ�");
	}
}

class Rabbit extends Animal {
	@Override
	public void show() {
		System.out.println("�䳢 �Դϴ�");
	}
}

class Eggle extends Animal {
	@Override
	public void show() {
		System.out.println("������ �Դϴ�");
	}
}


public class AnimalTest {
	// ������
	public void showAnimal(Animal animal) {
		System.out.print("�̰��� ���´� ");
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
