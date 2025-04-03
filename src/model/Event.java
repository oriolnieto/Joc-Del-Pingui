package model;

import java.util.ArrayList;

public class Event extends Casella{

	private String tipoEvent;
	
	public Event(int posicio, ArrayList<Jugador> jugadorsActuals, String tipoEvent) {
		super(posicio, jugadorsActuals);
		this.tipoEvent = tipoEvent;
	}

	@Override
	public void realitzarAccio() {
		
	}
}
