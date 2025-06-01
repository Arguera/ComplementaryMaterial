package com.amgems.complementarymaterial.application.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorResponseDTO {
    private String authorId;
    @JsonProperty
    private String authorName;
    @JsonProperty
    private String authorBirthDate;
}
