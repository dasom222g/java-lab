package abstractExample.templatePattern.player;

public class MainPlayer {

	public static void main(String[] args) {
		Player player = new Player();
		PlayerLevel advancedLevel = new AdvancedLevel();
		PlayerLevel superLevel = new SuperLevel();
		
		player.play(1);
		
		player.upgradeLevel(advancedLevel);
		player.play(2);
		
		player.upgradeLevel(superLevel);
		player.play(3);
	}

}
