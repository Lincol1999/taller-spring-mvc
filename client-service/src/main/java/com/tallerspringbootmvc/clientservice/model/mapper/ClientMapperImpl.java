package com.tallerspringbootmvc.clientservice.model.mapper;

import org.springframework.stereotype.Component;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClienteEntity;

@Component // This is a component, so it can be injected in other classes
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClienteEntity toEntity(ClientRequestDTO dto) {

        return ClienteEntity.builder()
                .documentNumber(dto.getDocumentNumber())
                .phoneNumber(dto.getPhoneNumber())
                .email(dto.getEmail())
                .build();
    }

    @Override
    public ClientResponseDTO toDTO(ClienteEntity entity) {

        return ClientResponseDTO.builder()
                .id(entity.getId())
                .documentNumber(entity.getDocumentNumber())
                .phoneNumber(entity.getPhoneNumber())
                .email(entity.getEmail())
                .build();

    }

}
