package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Minor;
import com.smplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MinorRepository extends JpaRepository<Minor, Long> {

    List<Minor> findAllByUserProfile(UserProfile userProfile);
}
