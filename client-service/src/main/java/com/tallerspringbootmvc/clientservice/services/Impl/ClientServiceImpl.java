package com.tallerspringbootmvc.clientservice.services.Impl;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClienteEntity;
import com.tallerspringbootmvc.clientservice.model.mapper.ClientMapper;
import com.tallerspringbootmvc.clientservice.repository.ClientRepository;
import com.tallerspringbootmvc.clientservice.services.ClientService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    @Override
    public ClientResponseDTO createClient(ClientRequestDTO clientRequestDTO) {

        if (Objects.isNull(clientRequestDTO)) {
            throw new RuntimeException("La request no puede contener un objeto vacio.");
        }

        ClienteEntity clienteEntity = clientMapper.toEntity(clientRequestDTO);
        clienteEntity = clientRepository.save(clienteEntity);

        return clientMapper.toDTO(clienteEntity);
    }

}
