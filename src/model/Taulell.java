package model;

import java.util.ArrayList;

public class Taulell {

	ArrayList<Casella> casillas;
	ArrayList<Jugador> jugadors;
	private int torns;
	private Jugador jugadorActual;
	
	
	public ArrayList<Casella> getCasillas() {
		return casillas;
	}
	public void setCasillas(ArrayList<Casella> casillas) {
		this.casillas = casillas;
	}
	public ArrayList<Jugador> getJugadors() {
		return jugadors;
	}
	public void setJugadors(ArrayList<Jugador> jugadors) {
		this.jugadors = jugadors;
	}
	public int getTorns() {
		return torns;
	}
	public void setTorns(int torns) {
		this.torns = torns;
	}
	public Jugador getJugadorActual() {
		return jugadorActual;
	}
	public void setJugadorActual(Jugador jugadorActual) {
		this.jugadorActual = jugadorActual;
	}
	
	public void actualitzarTaulell () {
		
	}
	
	
	
}
