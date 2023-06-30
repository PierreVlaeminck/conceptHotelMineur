package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for managing Hostel entities.
 */
@Repository
public interface HostelRepository extends JpaRepository<Hostel, Long> {

    /**
     * Retrieves a list of hostels based on the city.
     *
     * @param hostel the hostel object containing the city
     * @return a list of hostels matching the specified city
     */
    List<Hostel> findAllByCity(Hostel hostel);

    /**
     * Retrieves a hostel based on its ID.
     *
     * @param id the ID of the hostel
     * @return the hostel with the specified ID
     */
    Hostel findByIdH(Long id);
}