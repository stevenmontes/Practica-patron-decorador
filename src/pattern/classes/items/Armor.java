
package pattern.classes.items;

public class Armor extends Weapon {

	@Override
	public String getNombre() {
		return "Armor ";
	}

	@Override
	public int getHp() {
		return 20;
	}

	@Override
	public int getAtk() {
		return 0;
	}

	@Override
	public int getDef() {
		return 20;
	}

	@Override
	public int getMag() {
		return 0;
	}

}
