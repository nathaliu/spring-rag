package fr.efrei.spring_rag.service;

import fr.efrei.spring_rag.domain.Document;
import fr.efrei.spring_rag.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document BuildAndSave(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

}
