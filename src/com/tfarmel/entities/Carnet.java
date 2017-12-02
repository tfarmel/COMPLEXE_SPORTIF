package com.tfarmel.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Carnet implements Serializable {

	private Long id;
	private int nombreEntrees;

	public Carnet() {
		super();
	}

	public Carnet(int nombreEntrees) {
		super();
		this.nombreEntrees = nombreEntrees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNombreEntrees() {
		return nombreEntrees;
	}

	public void setNombreEntrees(int nombreEntrees) {
		this.nombreEntrees = nombreEntrees;
	}
}
