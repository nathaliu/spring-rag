package fr.efrei.spring_rag.domain;

import jakarta.persistence.*;
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String title;
    private String description;
    private String author;
    private String publisher;

}