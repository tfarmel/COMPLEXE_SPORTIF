package com.tfarmel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfarmel.entities.Carnet;

public interface CarnetDao extends JpaRepository<Carnet, Long> {

}
