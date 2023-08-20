package com.tallerspringbootmvc.clientservice.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tallerspringbootmvc.clientservice.dto.ClienteDTO;

@RestController
@RequestMapping(value = "/api/v1/clients")
public class ClienteController {

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll() {

        return ResponseEntity.ok().build();

    }

    @PostMapping
    public ResponseEntity<ClienteDTO> createCliente() {

        return ResponseEntity.ok().build();
    }

    // @DeleteMapping(value = "/{id}")
    // public ResponseEntity<void> deleteCliente(@PathVariable Long id){
    // try {

    // } catch (Exception e) {

    // }
    // }

}
