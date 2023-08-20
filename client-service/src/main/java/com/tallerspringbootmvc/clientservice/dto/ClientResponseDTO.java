package com.tallerspringbootmvc.clientservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDTO {

    private Long id;

    private Integer documentNumber;

    private String phoneNumber;

    private String email;
}
