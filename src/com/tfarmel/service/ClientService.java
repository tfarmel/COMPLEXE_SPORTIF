package com.tfarmel.service;

import java.util.Collection;
import java.util.List;

import com.tfarmel.Client;
import com.tfarmel.exception.BeanAlreadyExistException;
import com.tfarmel.exception.BeanNotExistException;

public interface ClientService   {
	
	public void createClient(Client c) throws BeanAlreadyExistException;
	public void updateClient(Client c) throws BeanNotExistException;
	public Client getClient(int id);
	public Collection<Client> listClient();

}
