package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {

    void findAllByCity(String city);
}
