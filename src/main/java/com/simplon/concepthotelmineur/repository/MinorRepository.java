package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Minor;
import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for managing Minor entities.
 */
@Repository
public interface MinorRepository extends JpaRepository<Minor, Long> {

    /**
     * Retrieves a list of minors associated with the specified user profile.
     *
     * @param userProfile the user profile object
     * @return a list of minors belonging to the specified user profile
     */
    List<Minor> findAllByUserProfile(UserProfile userProfile);
}