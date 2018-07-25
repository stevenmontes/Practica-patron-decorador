package pattern.classes.character;

import pattern.classes.element.DecoradorElemento;
import pattern.classes.element.Elemento;

public class Worker extends DecoradorElemento {
	Elemento arma;
	
	public Worker(Elemento arma) {
		this.arma = arma;
	}
	
	@Override
	public String getNombre() {
		return "Worker: " + this.arma.getNombre();
	}

	@Override
	public int getHp() {
		return 25 + this.arma.getHp();
	}

	@Override
	public int getAtk() {
		return 10 + this.arma.getAtk();
	}

	@Override
	public int getDef() {
		return 10 + this.arma.getDef();
	}

	@Override
	public int getMag() {
		return 10 + this.arma.getMag();
	}

}
