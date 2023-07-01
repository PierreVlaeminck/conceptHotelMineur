package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing UserProfile entities.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
   UserProfile findByUsername(String username);
}