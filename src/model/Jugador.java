package model;

import java.util.Random;

public abstract class Jugador {

	private Inventari inv;
	private int posicio;
	private String nom;
	private String color;
	
	public Jugador(int posicio, String nom, String color, Inventari inv) {
		this.posicio = posicio;
		this.nom = nom;
		this.color = color;
		this.inv = inv;
	}
	public Inventari getInv() {
		return inv;
	}
	public void setInv(Inventari inv) {
		this.inv = inv;
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
		maximDau = 6+1;
		Random rand = new Random();
		
		int numDau = rand.nextInt(maximDau);
		
		System.out.println("Ha sortit: " + numDau);

	}
	
	public void mourePosicio(int numDau) {
		posicio = posicio + numDau;
	}
	
}
