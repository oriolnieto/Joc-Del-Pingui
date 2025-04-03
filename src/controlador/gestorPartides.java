package controlador;

import model.Taulell;

public class gestorPartides {
	private String linkBBDD;
	private String username;
	private String password;
	
	public gestorPartides(String linkBBDD, String username, String password) {
		this.linkBBDD=linkBBDD;
		this.username=username;
		this.password=password;
	}
	public String getLinkBBDD() {
		return linkBBDD;
	}
	public void setLinkBBDD(String linkBBDD) {
		this.linkBBDD = linkBBDD;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Taulell carregarPartida() {
		return null;
	}
	public void guardarPartida(Taulell t) {
		
	}

}
