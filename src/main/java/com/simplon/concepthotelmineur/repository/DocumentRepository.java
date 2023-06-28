package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
