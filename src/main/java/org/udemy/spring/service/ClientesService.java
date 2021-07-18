package org.udemy.spring.service;

import org.springframework.stereotype.Service;
import org.udemy.spring.model.Cliente;
import org.udemy.spring.repository.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void save(Cliente cliente) {
        validate(cliente);
        this.repository.persist(cliente);
    }

    public void validate(Cliente cliente) {

    }
}
