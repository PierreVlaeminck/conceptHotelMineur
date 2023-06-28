package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Document;
import com.simplon.concepthotelmineur.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    public Document addDocument(Document document){
        return documentRepository.save(document);
    }

    public void deleteDocument(Long id){
        documentRepository.deleteById(id);
    }
}
