package com.helmi.paino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helmi.paino.dao.ClientRepository;
import com.helmi.paino.model.Client;

@RestController
@RequestMapping("/users")
public class apiController {
	
	@Autowired
	ClientRepository clientRepo;
		
	@GetMapping("")
	public String index() {
		return "Testaus";
	}

	@GetMapping("/all")
	public List<Client> findAll() {
		return clientRepo.findAll();
	}

	/*	*/

	@GetMapping("/{userName}")
	public Client findByName(@PathVariable final String userName) {
		return clientRepo.findByUserName(userName);

	}
	
	@PostMapping("/add")
	public Client addClient(@RequestBody final Client client) {
		clientRepo.save(client);
		return clientRepo.findByUserName(client.getUserName());		
	}
	
}
