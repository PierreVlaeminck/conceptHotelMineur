package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Bookmark entities.
 */
@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}