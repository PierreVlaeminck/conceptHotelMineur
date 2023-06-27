package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Minor;
import com.smplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MinorRepository extends JpaRepository<Minor, Long> {

    List<Minor> findAllByUserProfile(UserProfile userProfile);
}
