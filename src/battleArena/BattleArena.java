package battleArena;

import java.util.Scanner;

public class BattleArena {
	BaseCharacter p1 = new Dwarf ("Dwarf", 100);
	BaseCharacter p2 = new Dragon ("Dragon", 100);
	
	public void menu() {
		System.out.println(1 + " - attack" + "\n" + 2 + " - activate special attack" + "\n" + 3 + " - deactivate special attack");
		Scanner obj = new Scanner(System.in);
		int option = obj.nextInt();
		switch(option) {
		case 0: 
			
		}
	}
}
