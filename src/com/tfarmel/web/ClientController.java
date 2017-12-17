package com.tfarmel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tfarmel.dao.ClientDao;

@Controller
public class ClientController {
	
	@Autowired
	private ClientDao cDao;

}
