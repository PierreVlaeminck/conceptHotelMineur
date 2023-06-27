package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {

    void findAllByCity(String city);
}
