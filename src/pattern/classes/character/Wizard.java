package pattern.classes.character;

import pattern.classes.items.Weapon;

public class Wizard extends Character {
	private Weapon arma;
	
	public Wizard(Weapon arma) {
		this.arma = arma;
	}
	
	@Override
	public String getNombre() {
		return "Wisard: " + this.arma.getNombre();
	}

	@Override
	public int getHp() {
		return 8 + this.arma.getHp();
	}

	@Override
	public int getAtk() {
		return 15 + this.arma.getAtk();
	}

	@Override
	public int getDef() {
		return 15 + this.arma.getDef();
	}

	@Override
	public int getMag() {
		return 40 + this.arma.getMag();
	}

}
