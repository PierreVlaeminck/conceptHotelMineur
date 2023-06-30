package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Benefit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Benefit entities.
 */
@Repository
public interface BenefitRepository extends JpaRepository<Benefit, Long> {
}