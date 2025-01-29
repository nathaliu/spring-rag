package fr.efrei.spring_rag.domain;

import jakarta.persistence.*;

@Entity
public class Document {
    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String title;
    private String description;
    private String author;
    private String publisher;
}