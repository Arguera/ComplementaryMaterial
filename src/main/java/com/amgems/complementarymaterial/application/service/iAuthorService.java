package com.amgems.complementarymaterial.application.service;

import com.amgems.complementarymaterial.application.dto.request.CreateAuthorDTO;
import com.amgems.complementarymaterial.application.dto.response.AuthorResponseDTO;

import java.util.UUID;

public interface iAuthorService {
    public AuthorResponseDTO save(CreateAuthorDTO author) throws Exception;

    public AuthorResponseDTO getById(UUID id) throws Exception;
}