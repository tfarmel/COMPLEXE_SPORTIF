package com.tfarmel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfarmel.entities.Client;

public interface ClientDao extends JpaRepository<Client, Long> {

}
