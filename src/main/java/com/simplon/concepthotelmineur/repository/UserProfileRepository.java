package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing UserProfile entities.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    /**
     * Finds a UserProfile entity by the given username.
     *
     * @param username the username
     * @return the UserProfile entity if found, or null if not found
     */
    UserProfile findByUsername(String username);
}