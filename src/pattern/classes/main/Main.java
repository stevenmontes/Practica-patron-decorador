package pattern.classes.main;

import pattern.classes.character.Warrior;
import pattern.classes.items.Sword;

public class Main {

	public static void main(String[] args) {
		Sword majesty = new Sword();
		Warrior steven = new Warrior(majesty);
		System.out.println("Character: \n" 
		+ steven.getNombre() + "HP: " + steven.getHp() + "\n" + 
							   "ATK: " + steven.getAtk() + "\n" +  
							   "DEF: " + steven.getDef() + "\n" +
							   "MAG: " + steven.getMag() + "\n");
	}

}
