package abstractExample.templatePattern.player;

public class BeginnerLevel extends PlayerLevel {

	@Override
	protected void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	protected void jump(int count) {
		System.out.println("���� ���մϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("�� ���մϴ�.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** �ʱ޷��� �Դϴ� ******");
	}

}
