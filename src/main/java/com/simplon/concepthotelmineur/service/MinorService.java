package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.MinorRepository;
import com.simplon.concepthotelmineur.entity.Minor;
import com.simplon.concepthotelmineur.entity.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing Minor entities.
 */
@Service
@RequiredArgsConstructor
public class MinorService {

    private final MinorRepository minorRepository;

    /**
     * Adds a new minor.
     *
     * @param minor the minor object to be added
     * @return the added minor
     */
    public Minor addMinor(Minor minor) {
        return minorRepository.save(minor);
    }

    /**
     * Retrieves a list of minors associated with the specified user profile.
     *
     * @param userProfile the user profile object
     * @return a list of minors associated with the specified user profile
     */
    public List<Minor> findMinorByUserProfile(UserProfile userProfile) {
        return minorRepository.findAllByUserProfile(userProfile);
    }

    /**
     * Deletes a minor by its ID.
     *
     * @param id the ID of the minor to be deleted
     */
    public void deleteMinor(Long id) {
        minorRepository.deleteById(id);
    }

    /**
     * Updates an existing minor.
     *
     * @param minor the minor object to be updated
     * @return the updated minor
     */
    public Minor updateMinor(Minor minor) {
        return minorRepository.save(minor);
    }
}