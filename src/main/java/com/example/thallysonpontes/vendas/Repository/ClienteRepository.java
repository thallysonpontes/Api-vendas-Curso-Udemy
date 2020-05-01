package com.example.thallysonpontes.vendas.Repository;

import org.springframework.stereotype.Repository;

import com.example.thallysonpontes.vendas.model.Cliente;

@Repository
public interface ClienteRepository {
	void persistir(Cliente cliente);

}
