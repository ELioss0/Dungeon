package fr.elioss.dungeon;
import java.util.Scanner;


public class Player {
	static int playerCoo[] = {5,5};
	public static int[] getDirection() {
		System.out.println("N,S,E,O:");
		Scanner input = new Scanner(System.in);
		String direction = input.nextLine();
		switch(direction) {
			case "N":
				playerCoo[1] += 1;
				break;
			case "S":
				playerCoo[1] -= 1;
				break;
			case "O":
				playerCoo[0] -= 1;
				break;
			case "E":
				playerCoo[0] += 1;
				break;
		}
		System.out.println();
		return playerCoo;
	}
}
