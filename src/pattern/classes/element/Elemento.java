package pattern.classes.element;

public abstract class Elemento {
	protected String nombre = "desconocido";
	protected int hp;
	protected int atk;
	protected int def;
	protected int mag;
	
	public String getNombre() {
		return nombre;
	}

	public abstract int getHp();

	public abstract int getAtk();

	public abstract int getDef();

	public abstract int getMag();
}
