package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
}
