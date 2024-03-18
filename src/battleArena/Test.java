package battleArena;

import java.util.Scanner;

public class Test {
	
	public static BaseCharacter player1 = null;
	public static BaseCharacter player2 = null;
	static String name = "";
	static int choice = 0;
	
	
	public static int input(Scanner sc) {
		System.out.println("Choose your Character \n\t" + "|1| Dragon \n\t" + "|2| Dwarf");
		choice = -1;
			do {
				choice = sc.nextInt();
		}	while (!(choice >= 1 && choice <=2));
			return choice;
	}
	
	public static String enterCharacterName(Scanner sc) {
		System.out.println("Name your Character" + ": ");
			name = "";
			do { 
				name = sc.nextLine();
			}while (name.equals(""));
			return name;
	}
	
	public static BaseCharacter createCharakter(int choice, String name) {
		if(choice == 1) {
			return new Dragon(name, choice);
		}else if (choice == 2) {
			return new Dwarf(name, choice);
			
		}else {
			System.out.println("Something went wrong. Please try again!");
			
		}
		return null;

}
	
	public static int inputCharacter(Scanner sc, BattleArena a) {	
		System.out.println("It's" + a.attacker.getName() + "turn" + "\n");
		System.out.println("please choose your mode");
		System.out.println("|1| attack \n"+"|2| activate special ability \n" + "|3| deactivate special ability \n");
		int input = -1;
		do {
			input = sc.nextInt();
		} while (!(input>= 1 && input <= 3));
		return input;
	}
	
public static void main(String[] args) {
		
		int input;
		Scanner sc = new Scanner(System.in);
		do {
			choice = input(sc);
			name = enterCharacterName(sc);
			player1 = createCharakter(choice,name);
			choice = input(sc);
			name = enterCharacterName(sc);
			player2 = createCharakter(choice,name);
		} while (player1.equals(null) || player2.equals(null));
		
		BattleArena arena = new BattleArena(player1, player2);
		arena.selectStarter();
		int inputCharacter;
		do {
			inputCharacter = inputCharacter(sc, arena);
			arena.fight(inputCharacter);
			arena.electTheWinner();
			
		} while (arena.getWinner()== null);
		
		sc.close();

	}






	


}
