package model;

public class Foca extends Jugador {
	
	private boolean soborn;

	public Foca(int posicio, String nom, String color, boolean soborn, Inventari inv) {
		super(posicio, nom, color, inv);
		this.soborn = soborn;
	}

	public boolean isSoborn() {
		return soborn;
	}

	public void setSoborn(boolean soborn) {
		this.soborn = soborn;
	}
	
	public void aplastarJugador(Pingüi p) {
		
	}
	public void pegarJugador(Pingüi p) {
		p.setPosicio(p.getPosicio() - 1);
	}
	public void esSoborn() {
		soborn = true;
	}
	
}