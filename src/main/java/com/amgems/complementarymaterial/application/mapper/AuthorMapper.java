package com.amgems.complementarymaterial.application.mapper;

import com.amgems.complementarymaterial.application.dto.request.CreateAuthorDTO;
import com.amgems.complementarymaterial.application.dto.response.AuthorResponseDTO;
import com.amgems.complementarymaterial.domain.entity.Author;

public class AuthorMapper {
    public static AuthorResponseDTO mapToDTO(Author author) {
        return new AuthorResponseDTO(
                author.getId().toString(),
                author.getFirstName() + author.getLastName(),
                author.getBirthDate().toString()
        );
    }

    public static Author mapToEntity(CreateAuthorDTO createAuthorDTO) {
        return Author.builder()
                .firstName(createAuthorDTO.getFirstName())
                .lastName(createAuthorDTO.getLastName())
                .birthDate(createAuthorDTO.getBirthDate())
                .build();
    }
}
