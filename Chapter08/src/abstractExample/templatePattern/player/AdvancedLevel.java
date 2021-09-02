package abstractExample.templatePattern.player;

public class AdvancedLevel extends PlayerLevel {

	@Override
	protected void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	protected void jump(int jumpCount) {
		System.out.println((jumpCount + 1) + "번째로 높이 점프합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("턴 못합니다.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** 중급레벨 입니다 ******");
	}

}
