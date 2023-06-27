package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {

    List<Hostel> findAllByCity(Hostel hostel);
}
