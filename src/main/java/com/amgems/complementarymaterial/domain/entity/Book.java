package com.amgems.complementarymaterial.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String title;

    @Column
    private String description;

    @Column(unique = true)
    private String isbn;

    @Column
    private Date loanDate;

    @ManyToOne
    @JoinColumn(name = "id_author", nullable = false, foreignKey = @ForeignKey(name = "fk_book_author"))
    private Author author;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false, foreignKey = @ForeignKey(name = "fk_book_category"))
    private Category category;
}