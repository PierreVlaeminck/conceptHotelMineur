package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.BenefitHostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing BenefitHostel entities.
 */
@Repository
public interface BenefitHostelRepository extends JpaRepository<BenefitHostel, Long> {
}