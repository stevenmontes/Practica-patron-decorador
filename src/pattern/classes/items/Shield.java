package pattern.classes.items;

public class Shield extends Weapon {

	@Override
	public String getNombre() {
		return "Shield ";
	}

	@Override
	public int getHp() {
		return 10;
	}

	@Override
	public int getAtk() {
		return 0;
	}

	@Override
	public int getDef() {
		return 40;
	}

	@Override
	public int getMag() {
		return 0;
	}

}
