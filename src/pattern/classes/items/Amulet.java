package pattern.classes.items;

public class Amulet extends Weapon {

	@Override
	public String getNombre() {
		return "Amulet ";
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
		return 10;
	}

}
