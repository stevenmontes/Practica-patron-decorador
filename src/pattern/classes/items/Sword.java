package pattern.classes.items;

public class Sword extends Weapon{

	@Override
	public String getNombre() {
		return " Sword ";
	}

	@Override
	public int getHp() {
		return 1;
	}

	@Override
	public int getAtk() {
		return 10;
	}

	@Override
	public int getDef() {
		return 10;
	}

	@Override
	public int getMag() {
		return 0;
	}

}
