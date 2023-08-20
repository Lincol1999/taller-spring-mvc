package com.tallerspringbootmvc.clientservice.model.mapper;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClienteEntity;

public interface ClientMapper {

    // DTO --> Entity
    ClienteEntity toEntity(ClientRequestDTO dto);

    // Entity --> DTO
    ClientResponseDTO toDTO(ClienteEntity entity);
}
