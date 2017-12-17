package com.tfarmel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfarmel.entities.Adresse;

public interface AdresseDao extends JpaRepository<Adresse, Long> {

}
