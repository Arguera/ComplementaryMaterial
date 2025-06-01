package com.amgems.complementarymaterial.application.service.implementation;

import com.amgems.complementarymaterial.application.dto.request.CreateAuthorDTO;
import com.amgems.complementarymaterial.application.dto.response.AuthorResponseDTO;
import com.amgems.complementarymaterial.domain.entity.Author;
import com.amgems.complementarymaterial.application.mapper.AuthorMapper;
import com.amgems.complementarymaterial.infrastructure.repository.iAuthorRepository;
import com.amgems.complementarymaterial.application.service.iAuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements iAuthorService {
    private final iAuthorRepository authorRepository;

    @Override
    public AuthorResponseDTO save(CreateAuthorDTO authorData) throws Exception {
        Author toVerifyExisting = authorRepository.findAuthorByFirstName(authorData.getFirstName());
        if (toVerifyExisting != null) throw new Exception("User already exist");

        Author author = AuthorMapper.mapToEntity(authorData);

        Author authorCreated = authorRepository.save(author);

        return AuthorMapper.mapToDTO(authorCreated);
    }

    @Override
    public AuthorResponseDTO getById(UUID id) throws Exception {
        Author author = authorRepository.findByIdOrThrow(id);
        return AuthorMapper.mapToDTO(author);
    }
}
