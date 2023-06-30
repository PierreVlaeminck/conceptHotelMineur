package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Type entities.
 */
@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}