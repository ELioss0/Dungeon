package fr.elioss.dungeon;

public class Display {
	
	public static void dungeonDisplay(int x, int y, int... doorCoo) {
		/*On v�rifie si le joueur est hors limite*/
		if(Player.playerCoo[0] > x) {
			Player.playerCoo[0] -= 1;
		}
		else if(Player.playerCoo[0] == 0) {
			Player.playerCoo[0] += 1;
		}
		else if(Player.playerCoo[1] > y) {
			Player.playerCoo[1] -= 1;
		}
		else if(Player.playerCoo[1] == 0) {
			Player.playerCoo[1] += 1;
		}
		
		
		/*Cette boucle s'ex�cutera techniquement 2 fois mais sera stopp�e.*/
		display:
		for(int display = 1; display <= 2; display++) {
			/*On �crit un nombre de tiret �gal au nombre de la largeur de la salle (x).*/
			System.out.print("+");
			for(int largeur = 1; largeur <= x; largeur++) {
				System.out.print("-");
			}
			System.out.println("+");
			if(display == 2) {
				break display;
			}
			
			
			for(int hauteur = 1; hauteur <= y; hauteur++) {
				if(hauteur == doorCoo[1]) {
					System.out.print(" ");
				}
				else {System.out.print("|");}

				for(int largeur = 1; largeur <= x; largeur++) {
					if(hauteur == Player.playerCoo[1] && largeur == Player.playerCoo[0]) {
						System.out.print("@");
						continue;
					}
					System.out.print(" ");
				}
				System.out.println("|");
			}
			
		}
	}

}
