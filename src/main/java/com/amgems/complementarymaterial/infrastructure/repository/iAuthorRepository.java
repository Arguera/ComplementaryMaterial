package com.amgems.complementarymaterial.infrastructure.repository;

import com.amgems.complementarymaterial.domain.entity.Author;

import java.util.UUID;

public interface iAuthorRepository extends iGenericRepository<Author, UUID> {
    public Author findAuthorById(UUID id);
    public Author findAuthorByFirstName(String firstName);
    public Author findAuthorByLastName(String lastName);
}