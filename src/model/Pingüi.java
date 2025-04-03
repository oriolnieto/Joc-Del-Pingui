package model;

public class Pingüi extends Jugador {

	private Inventari inv;

	public Pingüi(int posicio, String nom, String color, Inventari inv) {
		super(posicio, nom, color);
		this.inv = inv;
	}
	
	public Inventari getInv() {
		return inv;
	}
	public void setInv(Inventari inv) {
		this.inv = inv;
	}
	public void gestioBatalla() {
		
	}
	public void utilitzarObjecte() {
		
	}
	public void afegirItem() {
		
	}
	public void treureItem() {
		
	}
}
