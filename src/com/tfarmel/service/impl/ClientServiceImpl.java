package com.tfarmel.service.impl;

import java.util.Collection;

import com.tfarmel.Client;
import com.tfarmel.exception.BeanAlreadyExistException;
import com.tfarmel.exception.BeanNotExistException;
import com.tfarmel.service.ClientService;

public class ClientServiceImpl implements ClientService {

	@Override
	public void createClient(Client c) throws BeanAlreadyExistException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client c) throws BeanNotExistException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Client> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
