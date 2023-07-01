package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.HostelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing Hostel entities.
 */
@Service
@RequiredArgsConstructor
public class HostelService {

    private final HostelRepository hostelRepository;

    /**
     * Retrieves a list of all hostels.
     *
     * @return a list of all hostels
     */
    public Page<Hostel> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.hostelRepository.findAll(pageable);
    }

    /**
     * Retrieves a hostel by its ID.
     *
     * @param id the ID of the hostel
     * @return the hostel with the specified ID
     */
    public Hostel findHostelByIdH(Long id){
        return hostelRepository.findByIdH(id);
    }

    /**
     * Retrieves a list of hostels based on the city.
     *
     * @param hostel the hostel object containing the city
     * @return a list of hostels with the specified city
     */
    public List<Hostel> findHostelByCity(Hostel hostel) {
        return hostelRepository.findAllByCity(hostel);
    }
}