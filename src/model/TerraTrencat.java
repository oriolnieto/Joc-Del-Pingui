package model;

import java.util.ArrayList;

public class TerraTrencat extends Casella {

	public TerraTrencat(int posicio, ArrayList<Jugador> jugadorsActuals) {
		super(posicio, jugadorsActuals);
		
	}

	@Override
	public void realitzarAccio() {
		for(Jugador j : this.jugadorsActuals) {
			if(j instanceof Pingui) {
				Pingui p = (Pingui)j;
				p.getInv();
			}
		}
	
	}
}
