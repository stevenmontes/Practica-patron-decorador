package pattern.classes.character;

import pattern.classes.element.DecoradorElemento;
import pattern.classes.element.Elemento;

public class Warrior extends DecoradorElemento {
	Elemento arma;
	
	public Warrior(Elemento arma) {
		this.arma = arma;
	}
	
	@Override
	public String getNombre() {
		return "Warrior: " + this.arma.getNombre();
	}

	@Override
	public int getHp() {
		return 20 + this.arma.getHp();
	}

	@Override
	public int getAtk() {
		return 30 + this.arma.getAtk();
	}

	@Override
	public int getDef() {
		return 30 + this.arma.getDef();
	}

	@Override
	public int getMag() {
		return 20 + this.arma.getMag();
	}
}
