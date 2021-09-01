package inheritance.downcasting;

import java.util.ArrayList;

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
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	@Override
	public void show() {
		System.out.println("ȣ���� �Դϴ�");
	}
	public void hunting() {
		System.out.println("ȣ���̴� ����մϴ�.");
	}
}

class Eagle extends Animal {
	@Override
	public void show() {
		System.out.println("������ �Դϴ�");
	}
	public void flying() {
		System.out.println("�������� ���ƴٴմϴ�.");
	}
}


public class AnimalTest {
	// �ٿ�ĳ���� ����
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
		
//		Human eggleDown = (Human)eagle; // eagle������ EagleŬ������ �����Ǿ��µ� HumanŬ���������� �ٿ�ĳ������
		if (eagle instanceof Human) { // false�� ������� ����
			Human eggleDown = (Human)eagle;
			eggleDown.readBook();
			System.out.println("eggleDown�Դϴ�");
		}
		
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		AnimalList.add(human);
		AnimalList.add(tiger);
		AnimalList.add(eagle);
		
		// �ٿ�ĳ���� ����
		AnimalTest test = new AnimalTest();
		test.animalAction(AnimalList);
	}
}
