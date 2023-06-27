package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
