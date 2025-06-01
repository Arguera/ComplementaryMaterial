package com.amgems.complementarymaterial.web.controllers;

import com.amgems.complementarymaterial.application.dto.GenericResponse;
import com.amgems.complementarymaterial.application.dto.request.CreateAuthorDTO;
import com.amgems.complementarymaterial.application.dto.response.AuthorResponseDTO;
import com.amgems.complementarymaterial.application.service.implementation.AuthorServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static com.amgems.complementarymaterial.util.Constants.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(API + AUTHOR_PATH)
public class AuthorController {
    private final AuthorServiceImpl authorService;

    @PostMapping(CREATE)
    public ResponseEntity<GenericResponse> create(@RequestBody @Valid CreateAuthorDTO authorData) throws Exception {
        AuthorResponseDTO authorCreated = authorService.save(authorData);
        return GenericResponse.builder().status(HttpStatus.CREATED).message("Author created successfully").data(authorCreated).build().buildResponse();
    }

    @GetMapping(FIND_BY_ID + "/{id}")
    public ResponseEntity<GenericResponse> findById(@PathVariable("id") UUID authorId) throws Exception {
        AuthorResponseDTO data = authorService.getById(authorId);
        return GenericResponse.builder().status(HttpStatus.OK).data(data).build().buildResponse();
    }
}
