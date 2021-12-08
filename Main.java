package fr.elioss.dungeon;

public class Main {
	public static void main(String[] args) {
		while(true) {
			Display.dungeonDisplay(20,10,5,5);
			Player.getDirection();
		}

	}

}
