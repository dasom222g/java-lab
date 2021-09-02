package abstractExample.templatePattern.player;

public class AdvancedLevel extends PlayerLevel {

	@Override
	protected void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	protected void jump(int jumpCount) {
		System.out.println((jumpCount + 1) + "��°�� ���� �����մϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("�� ���մϴ�.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** �߱޷��� �Դϴ� ******");
	}

}
