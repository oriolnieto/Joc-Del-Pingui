package model;

public class Pingüi extends Jugador {

	private Inventari inv;

	public Pingüi(int posicio, String nom, String color) {
		super(posicio, nom, color);
	}
	
	public Inventari getInv() {
		return inv;
	}
	public void setInv(Inventari inv) {
		this.inv = inv;
	}
	public void gestioBatalla() {
		int totalBolas  = 0;
		
		while(inv.llista.contains(null)) {
			totalBolas += + 1;
		}
		
	}
	public void utilitzarObjecte() {
		treureItem();
	}
	public void afegirItem() {
		inv.llista.add(null);
	}
	public void treureItem() {
		inv.llista.remove(null);
	}
}
