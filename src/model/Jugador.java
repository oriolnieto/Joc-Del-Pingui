package model;

public abstract class Jugador {

	private int posicio;
	private String nom;
	private String color;
	
	public Jugador(int posicio, String nom, String color) {
		this.posicio = posicio;
		this.nom = nom;
		this.color = color;
	}
	public int getPosicio() {
		return posicio;
	}
	public void setPosicio(int posicio) {
		this.posicio = posicio;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void tirarDau(int maximDau) {
		
	}
	
	public void mourePosicio(int p) {
		
	}
	
}
