package model;

public class Foca extends Jugador {
	
	private boolean soborn;

	public Foca(int posicio, String nom, String color, boolean soborn) {
		super(posicio, nom, color);
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
		
	}
	public void esSoborn() {
		
	}
	
}
