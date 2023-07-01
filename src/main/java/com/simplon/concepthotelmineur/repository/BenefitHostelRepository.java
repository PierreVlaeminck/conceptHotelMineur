package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.BenefitHostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing BenefitHostel entities.
 */
@Repository
public interface BenefitHostelRepository extends JpaRepository<BenefitHostel, Long> {

    /**
     * Finds a BenefitHostel entity by the given benefit type.
     *
     * @param benefit the benefit type
     * @return the BenefitHostel entity if found, or null if not found
     */
    BenefitHostel findByBenefitTypeS(String benefit);
}