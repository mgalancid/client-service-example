package com.example.client_service.repositories;

import com.example.client_service.models.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
