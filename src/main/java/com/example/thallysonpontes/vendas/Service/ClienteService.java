package com.example.thallysonpontes.vendas.Service;

import org.springframework.stereotype.Service;

import com.example.thallysonpontes.vendas.Repository.ClienteRepository;
import com.example.thallysonpontes.vendas.model.Cliente;

@Service
public class ClienteService {
	private ClienteRepository repository;
	
	
	public ClienteService(ClienteRepository repository ){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}

