package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Document entities.
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}