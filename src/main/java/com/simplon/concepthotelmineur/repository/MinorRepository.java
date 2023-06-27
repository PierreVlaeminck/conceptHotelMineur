package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Minor;
import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MinorRepository extends JpaRepository<Minor, Long> {

    List<Minor> findAllByUserProfile(UserProfile userProfile);
}
