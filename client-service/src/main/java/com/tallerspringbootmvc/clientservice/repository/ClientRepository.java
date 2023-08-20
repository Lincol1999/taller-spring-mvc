package com.tallerspringbootmvc.clientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tallerspringbootmvc.clientservice.model.ClienteEntity;

public interface ClientRepository extends JpaRepository<ClienteEntity, Long> {

}
