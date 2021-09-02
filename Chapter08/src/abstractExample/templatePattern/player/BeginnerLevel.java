package abstractExample.templatePattern.player;

public class BeginnerLevel extends PlayerLevel {

	@Override
	protected void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	protected void jump(int count) {
		System.out.println("점프 못합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("턴 못합니다.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** 초급레벨 입니다 ******");
	}

}
