package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Document;
import com.simplon.concepthotelmineur.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service class for managing Document entities.
 */
@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    /**
     * Adds a document.
     *
     * @param document the document to add
     * @return the added document
     */
    public Document addDocument(Document document) {
        return documentRepository.save(document);
    }

    /**
     * Deletes a document by its ID.
     *
     * @param id the ID of the document to delete
     */
    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }
}