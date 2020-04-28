package com.helmi.paino.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helmi.paino.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	Client findByUserName(String userName);

}
