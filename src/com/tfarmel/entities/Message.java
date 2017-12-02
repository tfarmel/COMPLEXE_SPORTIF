package com.tfarmel.entities;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class Message implements Serializable {
	
	private String rue;
	private int codePostal;
	private String ville;
	
	public Message() {
		super();
	}
	
	public Message(String rue, int codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public String getRue() {
		return rue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public int getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

}
