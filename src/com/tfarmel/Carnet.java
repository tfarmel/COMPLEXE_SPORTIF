package com.tfarmel;

public class Carnet {
	
	private int nombreEntrees;

	public Carnet() {
		super();
	}

	public Carnet(int nombreEntrees) {
		super();
		this.nombreEntrees = nombreEntrees;
	}

	public int getNombreEntrees() {
		return nombreEntrees;
	}

	public void setNombreEntrees(int nombreEntrees) {
		this.nombreEntrees = nombreEntrees;
	}
}
