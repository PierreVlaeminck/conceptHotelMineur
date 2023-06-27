package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Benefit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenefitRepository extends JpaRepository<Benefit, Long> {

    List<Benefit> getServicesByHostel(Hostel hostel);
}
