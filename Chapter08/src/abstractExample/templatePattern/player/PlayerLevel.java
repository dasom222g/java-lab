package abstractExample.templatePattern.player;

public abstract class PlayerLevel {
	protected abstract void run();
	protected abstract void jump(int jumpCount);
	protected abstract void turn();
	protected abstract void showLevelMessage();
	
	public final void go(int jumpCount) {
		showLevelMessage();
		run();
		for(int i = 0; i < jumpCount; i++) {
			jump(i);
		}
		turn();
	}
}
