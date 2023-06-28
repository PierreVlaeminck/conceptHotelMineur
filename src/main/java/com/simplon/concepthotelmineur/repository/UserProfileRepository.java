package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    void deleteByIdUp(Long idUp);

    UserProfile findByIdUp(UserProfile userProfile);
}
