package pattern.classes.items;

import pattern.classes.element.DecoradorElemento;

public class Weapon extends DecoradorElemento {

	@Override
	public String getNombre() {
		return "Indefine";
	}

	@Override
	public int getHp() {
		return 0;
	}

	@Override
	public int getAtk() {
		return 0;
	}

	@Override
	public int getDef() {
		return 0;
	}

	@Override
	public int getMag() {
		return 0;
	}
	
}
