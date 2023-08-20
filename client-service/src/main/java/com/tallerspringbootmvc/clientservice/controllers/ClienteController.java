package com.tallerspringbootmvc.clientservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.services.ClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1/clients")
@RequiredArgsConstructor
public class ClienteController {

    private final ClientService clientService;

    // @GetMapping
    // public ResponseEntity<List<ClientRequestDTO>> findAll() {

    // return ResponseEntity.ok().build();

    // }

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createCliente(@RequestBody ClientRequestDTO clientRequestDTO) {

        ClientResponseDTO clientResponseDTO = clientService.createClient(clientRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientResponseDTO);
    }

    // @DeleteMapping(value = "/{id}")
    // public ResponseEntity<void> deleteCliente(@PathVariable Long id){
    // try {

    // } catch (Exception e) {

    // }
    // }

}
